# quarkus-webapp-starter

Quarkus Web Application starter project to get you started with `Quarkus`, `Renarde`, `Tailwind CSS`, and `Shoelace`.

## Requirements

- JDK 21
- ~~NodeJS v20~~
- ~~NPM 10.2.4~~

~~This template doesn't use any `NodeJS` or `NPM` `maven` plugins, so be sure to have it installed on your machine.~~
It is now possible to use `mvnpm` entirely since `tailwindcss version 4`.

## Getting Started

1. Install `@tailwindcss/cli` globally, `npm install -g @tailwindcss/cli`
2. Run `./mvnw quarkus:dev` then stop (`Ctrl + C`), some errors maybe produced
3. Run `tailwindcss`, `npx @tailwindcss/cli -i ./src/main/css/main.css -o ./src/main/resources/web/main/main.css --watch`
4. Run `./mvnw quarkus:dev` this should be started without any errors
5. Open `http://localhost:8080` using web browser
