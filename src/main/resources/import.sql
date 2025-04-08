INSERT INTO tb_categoria (descricao) VALUES ('Curso'), ('Oficina');
INSERT INTO tb_atividade  (nome, descricao, preco, categoria_id) VALUES ('Curso de Html', 'Aprenda Html de forma prática', 80.00, 1), ('Oficina de Github', 'Controle versões de seus projetos', 50.00, 2);
INSERT INTO tb_bloco  (inicio, fim, atividade_id) VALUES ('2017-09-25T08:00:00Z','2017-09-25T11:00:00Z',1), ('2017-09-25T14:00:00Z','2017-09-25T18:00:00Z',2), ('2017-09-26T08:00:00Z','2017-09-26T11:00:00Z',2); 
INSERT INTO tb_participante (nome, email) VALUES ('José da Silva','jose@gmail.com'), ('Tiago Faria','tiago@gmail.com'), ('Maria do Rosario','maria@gmail.com'), ('Teresa Silva','teresa@gmail.com');
INSERT INTO tb_participantes_atividade  (atividade_id, participante_id) VALUES (1,1), (2,1), (1,2), (1,3),(2,3), (1,4);






