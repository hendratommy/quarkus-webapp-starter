import htmx from "htmx.org";

window.htmx = htmx;

declare global {
  interface Window {
    htmx: any;
  }
}
