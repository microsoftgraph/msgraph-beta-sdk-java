package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleManagement implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new RoleManagement and sets the default values.
     */
    public RoleManagement() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleManagement
     */
    @jakarta.annotation.Nonnull
    public static RoleManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagement();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cloudPC property value. The cloudPC property
     * @return a RbacApplicationMultiple
     */
    @jakarta.annotation.Nullable
    public RbacApplicationMultiple getCloudPC() {
        return this.backingStore.get("cloudPC");
    }
    /**
     * Gets the deviceManagement property value. The RbacApplication for Device Management
     * @return a RbacApplicationMultiple
     */
    @jakarta.annotation.Nullable
    public RbacApplicationMultiple getDeviceManagement() {
        return this.backingStore.get("deviceManagement");
    }
    /**
     * Gets the directory property value. The directory property
     * @return a RbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication getDirectory() {
        return this.backingStore.get("directory");
    }
    /**
     * Gets the enterpriseApps property value. The enterpriseApps property
     * @return a java.util.List<RbacApplication>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RbacApplication> getEnterpriseApps() {
        return this.backingStore.get("enterpriseApps");
    }
    /**
     * Gets the entitlementManagement property value. The RbacApplication for Entitlement Management
     * @return a RbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication getEntitlementManagement() {
        return this.backingStore.get("entitlementManagement");
    }
    /**
     * Gets the exchange property value. The exchange property
     * @return a UnifiedRbacApplication
     */
    @jakarta.annotation.Nullable
    public UnifiedRbacApplication getExchange() {
        return this.backingStore.get("exchange");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("cloudPC", (n) -> { this.setCloudPC(n.getObjectValue(RbacApplicationMultiple::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagement", (n) -> { this.setDeviceManagement(n.getObjectValue(RbacApplicationMultiple::createFromDiscriminatorValue)); });
        deserializerMap.put("directory", (n) -> { this.setDirectory(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("enterpriseApps", (n) -> { this.setEnterpriseApps(n.getCollectionOfObjectValues(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("exchange", (n) -> { this.setExchange(n.getObjectValue(UnifiedRbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cloudPC", this.getCloudPC());
        writer.writeObjectValue("deviceManagement", this.getDeviceManagement());
        writer.writeObjectValue("directory", this.getDirectory());
        writer.writeCollectionOfObjectValues("enterpriseApps", this.getEnterpriseApps());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeObjectValue("exchange", this.getExchange());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cloudPC property value. The cloudPC property
     * @param value Value to set for the cloudPC property.
     */
    public void setCloudPC(@jakarta.annotation.Nullable final RbacApplicationMultiple value) {
        this.backingStore.set("cloudPC", value);
    }
    /**
     * Sets the deviceManagement property value. The RbacApplication for Device Management
     * @param value Value to set for the deviceManagement property.
     */
    public void setDeviceManagement(@jakarta.annotation.Nullable final RbacApplicationMultiple value) {
        this.backingStore.set("deviceManagement", value);
    }
    /**
     * Sets the directory property value. The directory property
     * @param value Value to set for the directory property.
     */
    public void setDirectory(@jakarta.annotation.Nullable final RbacApplication value) {
        this.backingStore.set("directory", value);
    }
    /**
     * Sets the enterpriseApps property value. The enterpriseApps property
     * @param value Value to set for the enterpriseApps property.
     */
    public void setEnterpriseApps(@jakarta.annotation.Nullable final java.util.List<RbacApplication> value) {
        this.backingStore.set("enterpriseApps", value);
    }
    /**
     * Sets the entitlementManagement property value. The RbacApplication for Entitlement Management
     * @param value Value to set for the entitlementManagement property.
     */
    public void setEntitlementManagement(@jakarta.annotation.Nullable final RbacApplication value) {
        this.backingStore.set("entitlementManagement", value);
    }
    /**
     * Sets the exchange property value. The exchange property
     * @param value Value to set for the exchange property.
     */
    public void setExchange(@jakarta.annotation.Nullable final UnifiedRbacApplication value) {
        this.backingStore.set("exchange", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}
