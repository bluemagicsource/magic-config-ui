*************************
**** MAGIC-CONFIG-UI ****
*************************

Package Structure:
- org.bluemagic.config.ui.controller
    - This package contains all the controller classes that are needed
      to handle the various incoming requests.  For example, we may have a 
      controller for editing properties, for viewing the home page, etc.

- org.bluemagic.config.ui.exception
    - This package will contain all the possible exceptions that the UI can throw,
      each mapped to a corresponding HttpStatus code (403, 404, etc).

- org.bluemagic.config.ui.service
    - An intermediate layer that obfuscates the controller classes from the
      actual retrieval of the data.  This layer will make future
      inclusions/refactorings a lot easier.  In the beginning, this layer
      will probably not contain very much logic, but as time goes on and
      requirements come up, this is the layer that will see most of the changes.

- org.bluemagic.config.ui.utils
    - Commonly used methods, broken up into logical classes so that they
      can be used by any class.

- org.bluemagic.config.ui.vo
    - This package should contain all the "Value Objects" that the UI needs
      to render data to the client.  These objects should contain little to
      no actual logic in them, mostly just getters and setters.  These objects
      should drive how the service/dao returns its information to us.
