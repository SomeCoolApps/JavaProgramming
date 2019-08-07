*  *in the factory patter the logic of creating concrete implementations of a given supertype is put into factory layer. 
 *that layer is making the decision of what type of object to create. based on the defined criteria. 
 *in this case the factory decides to create a programmer or a manager based on the input provided to the create method.
 *although this logic is pretty simple and may have been embedded in the client side, 
 *but the creation decision can be complex based on some requirements which the client may not be aware of.
 *in such cases the factory can abstract that logic from the client. 
