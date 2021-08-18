# Singleton 
>> Motivação 
* Garantia de existência de um determinado número X de objetos de uma classe. (Independe do número de requisições  que receber para criá-lo)
Exemplos de aplicação 
* Único banco de dados 
* Único acesso ao arquivo de log 
* Única fachada (Padrão Facade)
>> Propósito 
* Assegura o controle da quantidade de instâncias da classe 
* Ponto de acesso global a ela 
>> Aplicabilidade 
* Exatamente uma instância da classe (acessível pelos clientes de ponto de acesso conhecido)
* Instância única deve ser extensível através de subclasses (clientes capazes de usar instância estendida sem alteração do código)
>> Participantes
* Define operação Instance que permite que clientes acessem instância única (Instance é operação de classe)
* Pode ser responsável pela criação de sua única instância 
>> Consequências 
* Acesso controlado a instância única 
* Espaço de nomes reduzido 
* Refinamento de operações e representação 
* Não há número variado de instância 
* Mais flexível do que operações de classes 