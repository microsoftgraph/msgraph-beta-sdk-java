package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoleManagement implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cloudPC property
     */
    private RbacApplicationMultiple cloudPC;
    /**
     * The RbacApplication for Device Management
     */
    private RbacApplicationMultiple deviceManagement;
    /**
     * The directory property
     */
    private RbacApplication directory;
    /**
     * The enterpriseApps property
     */
    private java.util.List<RbacApplication> enterpriseApps;
    /**
     * The RbacApplication for Entitlement Management
     */
    private RbacApplication entitlementManagement;
    /**
     * The exchange property
     */
    private UnifiedRbacApplication exchange;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new roleManagement and sets the default values.
     */
    public RoleManagement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a roleManagement
     */
    @jakarta.annotation.Nonnull
    public static RoleManagement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagement();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cloudPC property value. The cloudPC property
     * @return a rbacApplicationMultiple
     */
    @jakarta.annotation.Nullable
    public RbacApplicationMultiple getCloudPC() {
        return this.cloudPC;
    }
    /**
     * Gets the deviceManagement property value. The RbacApplication for Device Management
     * @return a rbacApplicationMultiple
     */
    @jakarta.annotation.Nullable
    public RbacApplicationMultiple getDeviceManagement() {
        return this.deviceManagement;
    }
    /**
     * Gets the directory property value. The directory property
     * @return a rbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication getDirectory() {
        return this.directory;
    }
    /**
     * Gets the enterpriseApps property value. The enterpriseApps property
     * @return a rbacApplication
     */
    @jakarta.annotation.Nullable
    public java.util.List<RbacApplication> getEnterpriseApps() {
        return this.enterpriseApps;
    }
    /**
     * Gets the entitlementManagement property value. The RbacApplication for Entitlement Management
     * @return a rbacApplication
     */
    @jakarta.annotation.Nullable
    public RbacApplication getEntitlementManagement() {
        return this.entitlementManagement;
    }
    /**
     * Gets the exchange property value. The exchange property
     * @return a unifiedRbacApplication
     */
    @jakarta.annotation.Nullable
    public UnifiedRbacApplication getExchange() {
        return this.exchange;
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
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cloudPC property value. The cloudPC property
     * @param value Value to set for the cloudPC property.
     */
    public void setCloudPC(@jakarta.annotation.Nullable final RbacApplicationMultiple value) {
        this.cloudPC = value;
    }
    /**
     * Sets the deviceManagement property value. The RbacApplication for Device Management
     * @param value Value to set for the deviceManagement property.
     */
    public void setDeviceManagement(@jakarta.annotation.Nullable final RbacApplicationMultiple value) {
        this.deviceManagement = value;
    }
    /**
     * Sets the directory property value. The directory property
     * @param value Value to set for the directory property.
     */
    public void setDirectory(@jakarta.annotation.Nullable final RbacApplication value) {
        this.directory = value;
    }
    /**
     * Sets the enterpriseApps property value. The enterpriseApps property
     * @param value Value to set for the enterpriseApps property.
     */
    public void setEnterpriseApps(@jakarta.annotation.Nullable final java.util.List<RbacApplication> value) {
        this.enterpriseApps = value;
    }
    /**
     * Sets the entitlementManagement property value. The RbacApplication for Entitlement Management
     * @param value Value to set for the entitlementManagement property.
     */
    public void setEntitlementManagement(@jakarta.annotation.Nullable final RbacApplication value) {
        this.entitlementManagement = value;
    }
    /**
     * Sets the exchange property value. The exchange property
     * @param value Value to set for the exchange property.
     */
    public void setExchange(@jakarta.annotation.Nullable final UnifiedRbacApplication value) {
        this.exchange = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
