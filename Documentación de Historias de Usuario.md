## Documentación de Historias de Usuario:

##  1: Registro de Usuarios

**Descripción:**
Como cliente quiero poder registrarme en la aplicación utilizando mi cuenta de Gmail para acceder al sistema.

**Criterios de Aceptación:**
- El sistema debe permitir el registro de usuarios a través de una cuenta de Gmail.
- El sistema debe mostrar un mensaje de confirmación después del registro exitoso.

**Supuestos:**
- Los usuarios ya tienen  cuenta de Gmail.
_________________________________________________________________________________________________________________
## 2: Compra de Productos

Descripción:
Como usuario registrado, quiero poder seleccionar productos de la distribuidora y realizar una compra en línea, para recibir mis productos en la dirección que indique.

**Criterios de Aceptación:**
- El sistema debe mostrar una lista de productos disponibles para la compra.
- El usuario debe poder agregar productos al carrito de compras.
- El sistema debe calcular el total de la compra y mostrar el costo final antes de realizar el pago.

Supuestos:
- Los productos están actualizados y 
___________________________________________________________________________________________________________________
##  3: Cálculo de Costo de Despacho

Descripción:
e realizazado una compra y quiero que el sistema calcule el costo de despacho basado en el total de la compra y la distancia a mi domicilio, para conocer el costo final antes de realizar el pago.

**Criterios de Aceptación:**
- Si la compra es mayor a $50,000, el despacho debe ser gratuito dentro de un radio de 20 km.
- Para compras entre $25,000 y $49,999, el sistema debe calcular una tarifa de $150 por kilómetro.
- Para compras menores a $25,000, el sistema debe calcular una tarifa de $300 por kilómetro.
- El sistema debe mostrar el costo de despacho antes de confirmar la compra.

**Supuestos:**
- La distancia se calcula automáticamente en función de la dirección del usuario.
___________________________________________________________________________________________________________________
## 4: Ingreso de Datos del Vehículo

Descripción:
Como usuario, quiero ingresar la información de mi vehículo para registrar detalles como marca, modelo, cilindrada, tipo de combustible, y capacidad de pasajeros.

Criterios de Aceptación:
- El sistema debe permitir al usuario ingresar los datos del vehículo.
- El sistema debe mostrar un resumen de la información ingresada antes de confirmar.

Supuestos:
- El usuario tiene acceso a los detalles de su vehículo al momento de ingresar la información.
