package com.microsoft.graph.models;

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
public class AuditLogRoot implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new AuditLogRoot and sets the default values.
     */
    public AuditLogRoot() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditLogRoot
     */
    @jakarta.annotation.Nonnull
    public static AuditLogRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLogRoot();
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
     * Gets the customSecurityAttributeAudits property value. Represents a custom security attribute audit log.
     * @return a java.util.List<CustomSecurityAttributeAudit>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomSecurityAttributeAudit> getCustomSecurityAttributeAudits() {
        return this.backingStore.get("customSecurityAttributeAudits");
    }
    /**
     * Gets the directoryAudits property value. The directoryAudits property
     * @return a java.util.List<DirectoryAudit>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryAudit> getDirectoryAudits() {
        return this.backingStore.get("directoryAudits");
    }
    /**
     * Gets the directoryProvisioning property value. The directoryProvisioning property
     * @return a java.util.List<ProvisioningObjectSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getDirectoryProvisioning() {
        return this.backingStore.get("directoryProvisioning");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("customSecurityAttributeAudits", (n) -> { this.setCustomSecurityAttributeAudits(n.getCollectionOfObjectValues(CustomSecurityAttributeAudit::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryAudits", (n) -> { this.setDirectoryAudits(n.getCollectionOfObjectValues(DirectoryAudit::createFromDiscriminatorValue)); });
        deserializerMap.put("directoryProvisioning", (n) -> { this.setDirectoryProvisioning(n.getCollectionOfObjectValues(ProvisioningObjectSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("provisioning", (n) -> { this.setProvisioning(n.getCollectionOfObjectValues(ProvisioningObjectSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("signIns", (n) -> { this.setSignIns(n.getCollectionOfObjectValues(SignIn::createFromDiscriminatorValue)); });
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
     * Gets the provisioning property value. Represents an action performed by the Microsoft Entra provisioning service and its associated properties.
     * @return a java.util.List<ProvisioningObjectSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getProvisioning() {
        return this.backingStore.get("provisioning");
    }
    /**
     * Gets the signIns property value. The signIns property
     * @return a java.util.List<SignIn>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SignIn> getSignIns() {
        return this.backingStore.get("signIns");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("customSecurityAttributeAudits", this.getCustomSecurityAttributeAudits());
        writer.writeCollectionOfObjectValues("directoryAudits", this.getDirectoryAudits());
        writer.writeCollectionOfObjectValues("directoryProvisioning", this.getDirectoryProvisioning());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("provisioning", this.getProvisioning());
        writer.writeCollectionOfObjectValues("signIns", this.getSignIns());
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
     * Sets the customSecurityAttributeAudits property value. Represents a custom security attribute audit log.
     * @param value Value to set for the customSecurityAttributeAudits property.
     */
    public void setCustomSecurityAttributeAudits(@jakarta.annotation.Nullable final java.util.List<CustomSecurityAttributeAudit> value) {
        this.backingStore.set("customSecurityAttributeAudits", value);
    }
    /**
     * Sets the directoryAudits property value. The directoryAudits property
     * @param value Value to set for the directoryAudits property.
     */
    public void setDirectoryAudits(@jakarta.annotation.Nullable final java.util.List<DirectoryAudit> value) {
        this.backingStore.set("directoryAudits", value);
    }
    /**
     * Sets the directoryProvisioning property value. The directoryProvisioning property
     * @param value Value to set for the directoryProvisioning property.
     */
    public void setDirectoryProvisioning(@jakarta.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this.backingStore.set("directoryProvisioning", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the provisioning property value. Represents an action performed by the Microsoft Entra provisioning service and its associated properties.
     * @param value Value to set for the provisioning property.
     */
    public void setProvisioning(@jakarta.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this.backingStore.set("provisioning", value);
    }
    /**
     * Sets the signIns property value. The signIns property
     * @param value Value to set for the signIns property.
     */
    public void setSignIns(@jakarta.annotation.Nullable final java.util.List<SignIn> value) {
        this.backingStore.set("signIns", value);
    }
}
