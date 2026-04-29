# Aula_10_Padrao-Adapter

Imagine que você está desenvolvendo uma aplicação que pode ser utilizada com 3 perfis de clientes: 1) Gratuito, 2) Básico e 3) Ultimate.

O seu aplicativo pode ser utilizado com 3 tipos distintos de SGBD de acordo com o perfil de cada tipo de conta. 1) Single usuário e banco de dados de transações únicas 2) multi usuário mas com banco de dados de transações únicas e 3) Multi usuário e banco de dados com múltiplas transações.

Os SGBDs são:

1) Paradox

2) Firebird

3) MySQL.

Faça uma aplicação que utilize o padrão adapter na qual o SGBD utilizado será determinado pelo perfil do usuário.  

<img width="1220" height="846" alt="aula 10 diagrama" src="https://github.com/user-attachments/assets/6c90b256-1a93-4ca1-a89a-548f62f5c82e" />

