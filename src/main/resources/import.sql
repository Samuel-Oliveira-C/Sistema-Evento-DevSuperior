INSERT INTO tb_categoria (id, descricao) VALUES ('01HZYZKJ7X6YV4M9JQ2ZK3X4W7', 'Tecnologia');

INSERT INTO tb_atividade (id, nome, descricao, preco) VALUES ('01EX8Y21KBH49ZZCA7KSKH6X1C', 'Curso de Java', 'Curso completo de Java com Spring Boot', 499.90);

INSERT INTO tb_bloco (id, inicio, fim, atividade_id) VALUES ('01EX8Y21KBH49ZZCA7KSKH6X2D', '2024-07-01 09:00:00', '2024-07-01 12:00:00', '01EX8Y21KBH49ZZCA7KSKH6X1C');


-- Aqui eu adicionei diretamente um ID ULID, por que para a atividade não é 
-- necessário implementar o repository.

-- Ulid com exemplos: https://github.com/f4b6a3/ulid-creator
