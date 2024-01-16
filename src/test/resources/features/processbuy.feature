Feature: Proceso de compra
  Yo como usuario
  Quiero añadir uno o varios producto al carrito de compras
  Para realizar una compra en el aplicativo


  @este
  Scenario: Verificar la búsqueda de un producto
    Given que el usuario está en la página de inicio
    When el usuario busca "Zapatos"
    Then se deberia mostrar los resultados relacionados con "Zapatos para hombre"








