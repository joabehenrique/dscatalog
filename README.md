# ⚡ DSCatalog

![GitHub repo size](https://img.shields.io/github/repo-size/joabehenrique/dscatalog?style=flat)
![GitHub language count](https://img.shields.io/github/languages/count/joabehenrique/dscatalog?style=flat)
![GitHub forks](https://img.shields.io/github/forks/joabehenrique/dscatalog?style=flat)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/joabehenrique/dscatalog?style=flat)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/joabehenrique/dscatalog?style=flat)

> Project developed on the DevSuperior spring boot track.

## 💻 Requirements

Before you begin, make sure you have met the following requirements:

- You need the version `11` of `Java` on your machine.

If you need installation instructions, [click here](https://www.oracle.com/java/technologies/downloads/).

## 🚀 Installing DSCatalog


To install DSCatalog, follow these steps:

1º Clone the repository.

```
>  git clone https://github.com/joabehenrique/dscatalog.git
```
2º Just build project and run
```
> SHIFT + F10 (For Intellij IDEA)
```
## ☕ Using DSCatalog

To use DSCatalog, follow these steps:

*After running the project

Getting all the products

```
(GET) /products
```
Getting all the categories

```
(GET) /categories
```

Getting a product

```
(GET) /products/{id}
```

Getting a category

```
(GET) /categories/{id}
```
Deleting a product

```
(DELETE) /products/{id}
```
Deleting a category

```
(DELETE) /categories/{id}
```
Creating a product

```
(POST) /products

{
  "name": "The Lord of the Rings",
  "price": 90.5,
  "date": "2020-07-13T20:50:07.12345Z",
  "description": "Lorem ipsum dolor sit amet, consectetur",
  "img_url": "https://raw.githubusercontent.com/backend/img/1-big.jpg",
  "categories": [
    {
      "id": 1
    },
    {
      "id": 3
    }
  ]
}
```

Creating a category

```
(POST) /categories

{
  "name": "computing",
}
```

Changing a product

```
(PUT) /products/{id}

{
  "name": "Rails for Dummies",
  "price": 2250.0,
  "date": "2020-07-14T10:00:00Z",
  "description": "Lorem ipsum dolor sit amet, consectetur",
  "img_url": "https://raw.githubusercontent.com/backend/img/2-big.jpg",
  "categories": [
    {
      "id": 2
    },
    {
      "id": 1
    }
  ]
}
```

Changing a category

```
(POST) /categories

{
  "name": "gamer",
}
```

## 📫 Contributing to Exlivery

To contribute to Exlivery, follow these steps:

1. Fork this repository.
2. Create a branch: `git checkout -b <nome_branch>`.
3. Make your changes and commit them: `git commit -m '<commit_message>'`
4. Send to the original branch: `git push origin DSCatalog / <local>`
5. Create the pull request.

Alternatively, see the GitHub documentation at [how to create a pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request)

## 🤝 Author and Contributors

We thank the following people who contributed to this project:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/joabehenrique">
        <img src="https://avatars3.githubusercontent.com/u/64988299" width="100px" style="border-radius: 90px" alt="Foto do Joabe Henrique no GitHub"/><br>
        <sub>
          <b>Joabe Henrique [Author]</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 😄 Be one of the contributors<br>

Do you want to be part of this project? Click [here](https://github.com/joabehenrique/dscatalog/blob/master/CONTRIBUTING.md) and read how to contribute.

## 📝 License

This project is under license. See the [license](https://github.com/joabehenrique/dscatalog/blob/master/LICENSE.md) file for more details.
