INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0001', 'Bulbasaur', 'There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.', '{"GRASS", "POISON"}', '{"FIRE","PSYCHIC","FLYING","ICE"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0001','GRASS');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0001','POISON');
INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0002', 'Ivysaur', 'When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.', '{"GRASS", "POISON"}', '{"FIRE","PSYCHIC","FLYING","ICE"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0002','GRASS');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0002','POISON');
INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0003', 'Venusaur', 'Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.', '{"GRASS", "POISON"}', '{"FIRE","PSYCHIC","FLYING","ICE"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0003','GRASS');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0003','POISON');

INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0004', 'Charmander', 'It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.', '{"FIRE"}', '{"WATER","GROUND","ROCK"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0004','FIRE');
INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0005', 'Charmeleon', 'It has a barbaric nature. In battle, it whips its fiery tail around and slashes away with sharp claws.', '{"FIRE"}', '{"WATER","GROUND","ROCK"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0005','FIRE');
INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0006', 'Charizard', 'It is said that Charizard’s fire burns hotter if it has experienced harsh battles.', '{"FIRE", "FLYING"}', '{"WATER","GROUND","ROCK"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0006','FIRE');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0006','FLYING');

INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0007', 'Squirtle', 'When it retracts its long neck into its shell, it squirts out water with vigorous force.', '{"WATER"}', '{"GRASS","ELECTRIC"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0007','WATER');
INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0008', 'Wartortle', 'It is recognized as a symbol of longevity. If its shell has algae on it, that Wartortle is very old.', '{"WATER"}', '{"GRASS","ELECTRIC"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0008','WATER');
INSERT INTO Pokemon(id, number, name, description, types, weaknesses)
VALUES (nextval('Pokemon_SEQ'), '0009', 'Blastoise', 'It crushes its foe under its heavy body to cause fainting. In a pinch, it will withdraw inside its shell.', '{"WATER"}', '{"GRASS","ELECTRIC"}');
INSERT INTO TypeMap(id, pokemonNumber, type)
VALUES(nextval('TypeMap_SEQ'), '0009','WATER');