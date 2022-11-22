package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RoleManagement implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The cloudPC property */
    private RbacApplicationMultiple _cloudPC;
    /** The RbacApplication for Device Management */
    private RbacApplicationMultiple _deviceManagement;
    /** The directory property */
    private RbacApplication _directory;
    /** The RbacApplication for Entitlement Management */
    private RbacApplication _entitlementManagement;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new RoleManagement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RoleManagement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RoleManagement
     */
    @javax.annotation.Nonnull
    public static RoleManagement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoleManagement();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the cloudPC property value. The cloudPC property
     * @return a rbacApplicationMultiple
     */
    @javax.annotation.Nullable
    public RbacApplicationMultiple getCloudPC() {
        return this._cloudPC;
    }
    /**
     * Gets the deviceManagement property value. The RbacApplication for Device Management
     * @return a rbacApplicationMultiple
     */
    @javax.annotation.Nullable
    public RbacApplicationMultiple getDeviceManagement() {
        return this._deviceManagement;
    }
    /**
     * Gets the directory property value. The directory property
     * @return a rbacApplication
     */
    @javax.annotation.Nullable
    public RbacApplication getDirectory() {
        return this._directory;
    }
    /**
     * Gets the entitlementManagement property value. The RbacApplication for Entitlement Management
     * @return a rbacApplication
     */
    @javax.annotation.Nullable
    public RbacApplication getEntitlementManagement() {
        return this._entitlementManagement;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("cloudPC", (n) -> { this.setCloudPC(n.getObjectValue(RbacApplicationMultiple::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagement", (n) -> { this.setDeviceManagement(n.getObjectValue(RbacApplicationMultiple::createFromDiscriminatorValue)); });
        deserializerMap.put("directory", (n) -> { this.setDirectory(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("entitlementManagement", (n) -> { this.setEntitlementManagement(n.getObjectValue(RbacApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cloudPC", this.getCloudPC());
        writer.writeObjectValue("deviceManagement", this.getDeviceManagement());
        writer.writeObjectValue("directory", this.getDirectory());
        writer.writeObjectValue("entitlementManagement", this.getEntitlementManagement());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the cloudPC property value. The cloudPC property
     * @param value Value to set for the cloudPC property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPC(@javax.annotation.Nullable final RbacApplicationMultiple value) {
        this._cloudPC = value;
    }
    /**
     * Sets the deviceManagement property value. The RbacApplication for Device Management
     * @param value Value to set for the deviceManagement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceManagement(@javax.annotation.Nullable final RbacApplicationMultiple value) {
        this._deviceManagement = value;
    }
    /**
     * Sets the directory property value. The directory property
     * @param value Value to set for the directory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectory(@javax.annotation.Nullable final RbacApplication value) {
        this._directory = value;
    }
    /**
     * Sets the entitlementManagement property value. The RbacApplication for Entitlement Management
     * @param value Value to set for the entitlementManagement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntitlementManagement(@javax.annotation.Nullable final RbacApplication value) {
        this._entitlementManagement = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
