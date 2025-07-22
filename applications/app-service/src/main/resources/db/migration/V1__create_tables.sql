CREATE TABLE users
(
    id             SERIAL PRIMARY KEY,
    account_number VARCHAR(50)         NOT NULL,
    number_id      VARCHAR(20)         NOT NULL UNIQUE,
    phone_number   VARCHAR(15)         NOT NULL,
    name           VARCHAR(100)        NOT NULL,
    email          VARCHAR(100) UNIQUE NOT NULL,
    password       VARCHAR(16)         NOT NULL,
    plan_id        INT REFERENCES plans (id),
    created_at     DATE DEFAULT CURRENT_DATE
);

CREATE TABLE plans
(
    id          INTEGER PRIMARY KEY,
    name        VARCHAR(100)   NOT NULL,
    price       INTEGER(10, 2) NOT NULL,
    data_gb     INTEGER            NOT NULL,
    minutes     INTEGER            NOT NULL,
    sms         INTEGER            NOT NULL,
    description TEXT
);

CREATE TABLE bills
(
    id         SERIAL PRIMARY KEY,
    user_id    INTEGER REFERENCES users (id),
    plan_id    INTEGER REFERENCES plans (id),
    period     VARCHAR(20) NOT NULL,
    amount     INTEGER(10, 2) NOT NULL,
    due_date   DATE         NOT NULL,
    issue_date DATE         NOT NULL,
    created_at DATE DEFAULT CURRENT_DATE
);

CREATE TABLE usage
(
    id           SERIAL PRIMARY KEY,
    user_id      INTEGER REFERENCES users (id),
    data_gb      INTEGER NOT NULL,
    minutes      INTEGER NOT NULL,
    sms          INTEGER NOT NULL,
    last_updated DATE DEFAULT CURRENT_DATE
);
