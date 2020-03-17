package com.store.service;

public class ItemServiceImplProxy implements com.store.service.ItemServiceImpl {
  private String _endpoint = null;
  private com.store.service.ItemServiceImpl itemServiceImpl = null;
  
  public ItemServiceImplProxy() {
    _initItemServiceImplProxy();
  }
  
  public ItemServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initItemServiceImplProxy();
  }
  
  private void _initItemServiceImplProxy() {
    try {
      itemServiceImpl = (new com.store.service.ItemServiceImplServiceLocator()).getItemServiceImpl();
      if (itemServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)itemServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)itemServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (itemServiceImpl != null)
      ((javax.xml.rpc.Stub)itemServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.store.service.ItemServiceImpl getItemServiceImpl() {
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl;
  }
  
  public com.store.model.Item getItem(int itemId) throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl.getItem(itemId);
  }
  
  public com.store.model.Item[] getAllItems() throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl.getAllItems();
  }
  
  public boolean addItem(com.store.model.Item item) throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl.addItem(item);
  }
  
  public boolean deleteItem(int itemId) throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl.deleteItem(itemId);
  }
  
  
}