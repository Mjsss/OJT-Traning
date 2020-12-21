# OJT-Traning
#### セットアップ準備

　・JDKインストール（ホームページ）

　・Dockerインストール（ホームページ）

##### DockerでDB作成及びデータ初期化

```
$cd dev-tool
#コンテナ立ち上がり
$docker-compose -f docker-compose.yml up -d
```

　起動した後に、DBコンテナ起動済みがどうかを確認する

##### コンテナ停止

```
$docker-compose stop
```

##### サービス削除

```
$docker-compose down
```

#### ソース取得と起動

資材取得Clone

```
git clone https://github.com/Mjsss/OJT-Traning-BackEnd.git
```

Visual Codeで開く

　■Java Extension Packをインストール(下記の拡張機能がまとまってる)
　・Language Support for Java™ by Red Hat
　・Debugger for Java
　・Java Test Runner
　・Maven for Java
　・Java Dependency Viewer
　・Visual Studio IntelliCode