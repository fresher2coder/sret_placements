INSERT INTO customers (name, city) VALUES
('Alice', 'Delhi'),
('Bob', 'Mumbai'),
('Charlie', 'Bangalore'),
('David', 'Hyderabad'),
('Eve', 'Chennai');

INSERT INTO products (name, price) VALUES
('Laptop', 55000.00),
('Mouse', 500.00),
('Keyboard', 800.00),
('Monitor', 9000.00),
('USB Cable', 150.00);

INSERT INTO orders (customer_id, order_date) VALUES
(1, '2025-07-01'),
(2, '2025-07-02'),
(3, '2025-07-03'),
(1, '2025-07-04'),
(4, '2025-07-05');

INSERT INTO order_details (order_id, product_id, quantity) VALUES
(1, 1, 1),  -- Alice buys Laptop
(1, 2, 2),  -- Alice buys 2 Mice
(2, 3, 1),  -- Bob buys Keyboard
(3, 1, 1),  -- Charlie buys Laptop
(3, 4, 2),  -- Charlie buys 2 Monitors
(4, 5, 3),  -- Alice buys 3 USB Cables
(5, 2, 1);  -- David buys Mouse
