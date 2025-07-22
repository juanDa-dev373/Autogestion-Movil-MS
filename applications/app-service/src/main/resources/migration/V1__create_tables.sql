CREATE TABLE users
(
    id             SERIAL PRIMARY KEY,
    account_number VARCHAR(50)         NOT NULL,
    number_id      VARCHAR(20)         NOT NULL UNIQUE,
    phone_number   VARCHAR(15)         NOT NULL,
    name           VARCHAR(100)        NOT NULL,
    email          VARCHAR(100) UNIQUE NOT NULL,
    plan_id        INT REFERENCES plans (id),
    created_at     DATE DEFAULT CURRENT_DATE
);

CREATE TABLE plans
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(100)   NOT NULL,
    price       DECIMAL(10, 2) NOT NULL,
    data_gb     INT            NOT NULL,
    minutes     INT            NOT NULL,
    sms         INT            NOT NULL,
    description TEXT
);

CREATE TABLE bills
(
    id         SERIAL PRIMARY KEY,
    user_id    INT REFERENCES users (id),
    plan_id    INT REFERENCES plans (id),
    period     VARCHAR(20) NOT NULL,
    amount     DECIMAL(10, 2) NOT NULL,
    due_date   DATE         NOT NULL,
    issue_date DATE         NOT NULL,
    created_at DATE DEFAULT CURRENT_DATE
);

CREATE TABLE usage
(
    id           SERIAL PRIMARY KEY,
    user_id      INT REFERENCES users (id),
    data_gb      INT NOT NULL,
    minutes      INT NOT NULL,
    sms          INT NOT NULL,
    last_updated DATE DEFAULT CURRENT_DATE
);
