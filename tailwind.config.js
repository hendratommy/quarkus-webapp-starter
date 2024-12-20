/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./src/main/resources/**/*.html",
    "./src/main/resources/**/*.{js,ts}",
  ],
  theme: {
    extend: {},
  },
  plugins: [
    require("@tailwindcss/typography"),
  ],
}

