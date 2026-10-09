CREATE TABLE customers (
    customer_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    status VARCHAR(20) NOT NULL,
    balance DECIMAL(12,2) NOT NULL DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE merchants (
    merchant_id VARCHAR(20) PRIMARY KEY,
    merchant_name VARCHAR(150) NOT NULL,
    status VARCHAR(20) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE transactions (
    transaction_id VARCHAR(30) PRIMARY KEY,
    customer_id VARCHAR(20) NOT NULL,
    merchant_id VARCHAR(20) NOT NULL,
    amount DECIMAL(12,2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    failure_reason VARCHAR(255),
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);