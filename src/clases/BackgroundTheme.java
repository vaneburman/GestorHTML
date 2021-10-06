package clases;

import interfaces.IElemento;

public enum BackgroundTheme implements IElemento {
        LIGHT("#F5F2D7","#3A3B40"),
        ULTRALIGHT("#FAF9F7","#232324"),
        DARK("#292727","#F7F7F7"),
        BLACK("#070708","#EDEDF5");

        private String backgroundColor;
        private String color;


        private BackgroundTheme(String backgroundColor, String color){
            this.backgroundColor = backgroundColor;
            this.color = color;

        }

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public String getColor() {
            return color;
        }


    @Override
    public String devolverElemento() {
        String style = "<style> body{margin: 1rem 2rem; background-color: $backgroundColor; color: $color} </style>";
        style = style.replace("$backgroundColor", backgroundColor).replace("$color", color);
        return style;
    }
}


