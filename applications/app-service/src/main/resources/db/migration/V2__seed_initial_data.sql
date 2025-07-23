INSERT INTO plans (name, price, data_gb, minutes, sms, description)
VALUES ('Basic', 9.99, 10, 100, 50, 'Plan básico para empezar'),
('Plan Económico', 15.99, 1, 100, 50, 'Ideal para uso ligero'),
('Plan Pro', 39.99, 8, 1000, 200, 'Perfecto para profesionales');


INSERT INTO users (account_number, number_id, phone_number, name, email, password, plan_id, active)
VALUES ('ACC123', 'ID123', '3000000000', 'User 1', 'user1@mail.com', '$2a$10$0Ir816uoKvhM.IYrQPZqqeZGf51OxweQYF5R9uXDf91IxQ1vuLoxK', 1, true),
       ('ACC124', 'ID124', '2500000000', 'User 2', 'user2@mail.com', '$2a$10$0Ir816uoKvhM.IYrQPZqqeZGf51OxweQYF5R9uXDf91IxQ1vuLoxK', 3, true);

-- Insertar facturas (bills) para diferentes usuarios
INSERT INTO bills (user_id, plan_id, period, amount, due_date, issue_date) VALUES
                                                                               (1, 1, '2025-06', 9.99, '2025-06-30', '2025-06-01'),
                                                                               (1, 2, '2025-07', 15.99, '2025-07-30', '2025-07-01'),
                                                                               (2, 2, '2025-06', 15.99, '2025-06-30', '2025-06-01'),
                                                                               (2, 2, '2025-07', 15.99, '2025-07-30', '2025-07-01'),
                                                                               (1, 3, '2025-07', 39.99, '2025-07-30', '2025-07-01');

-- Insertar uso (usage) para los usuarios
INSERT INTO usage (user_id, data_gb, minutes, sms, last_updated) VALUES
                                                                     (1, 0.8, 90, 45, CURRENT_DATE),
                                                                     (2, 7, 950, 180, CURRENT_DATE);