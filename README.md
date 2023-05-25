# Задание

1. Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).


   <img src="screenshots/1.png" style="height: 480px; width: auto">
    

2. Создать директорию, переместить файл туда.
   

   <img src="screenshots/2.png">


3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.
   
   - Скачиваем необходимый репозиторий:
   
   wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb

   <img src="screenshots/3_1.png">

   - Устанавливаем репозиторий:
   
   sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb
   
   <img src="screenshots/3_2.png">
   
   - Обновляем все установленные пакеты в репозитории 

   sudo apt-get update
      
   <img src="screenshots/3_3.png">
     
   - Устанавливаем один из пакетов в репозитории:
   
   sudo apt-get install mysql-client
   
   <img src="screenshots/3_4.png">


4. Установить и удалить deb-пакет с помощью dpkg.

   wget http://archive.ubuntu.com/ubuntu/pool/universe/p/pacman/pacman_10-17.2_amd64.deb
   
   sudo dpkg -i pacman_10-17.2_amd64.deb
   <img src="screenshots/4_1.png">

   sudo dpkg -r pacman
   <img src="screenshots/4_2.png">


5. Выложить историю команд в терминале ubuntu

      <img src="screenshots/5.png">


