package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuditLogRoot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The customSecurityAttributeAudits property
     */
    private java.util.List<CustomSecurityAttributeAudit> customSecurityAttributeAudits;
    /**
     * The directoryAudits property
     */
    private java.util.List<DirectoryAudit> directoryAudits;
    /**
     * The directoryProvisioning property
     */
    private java.util.List<ProvisioningObjectSummary> directoryProvisioning;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The provisioning property
     */
    private java.util.List<ProvisioningObjectSummary> provisioning;
    /**
     * The signIns property
     */
    private java.util.List<SignIn> signIns;
    /**
     * Instantiates a new AuditLogRoot and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuditLogRoot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AuditLogRoot
     */
    @javax.annotation.Nonnull
    public static AuditLogRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuditLogRoot();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the customSecurityAttributeAudits property value. The customSecurityAttributeAudits property
     * @return a customSecurityAttributeAudit
     */
    @javax.annotation.Nullable
    public java.util.List<CustomSecurityAttributeAudit> getCustomSecurityAttributeAudits() {
        return this.customSecurityAttributeAudits;
    }
    /**
     * Gets the directoryAudits property value. The directoryAudits property
     * @return a directoryAudit
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryAudit> getDirectoryAudits() {
        return this.directoryAudits;
    }
    /**
     * Gets the directoryProvisioning property value. The directoryProvisioning property
     * @return a provisioningObjectSummary
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getDirectoryProvisioning() {
        return this.directoryProvisioning;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the provisioning property value. The provisioning property
     * @return a provisioningObjectSummary
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getProvisioning() {
        return this.provisioning;
    }
    /**
     * Gets the signIns property value. The signIns property
     * @return a signIn
     */
    @javax.annotation.Nullable
    public java.util.List<SignIn> getSignIns() {
        return this.signIns;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the customSecurityAttributeAudits property value. The customSecurityAttributeAudits property
     * @param value Value to set for the customSecurityAttributeAudits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomSecurityAttributeAudits(@javax.annotation.Nullable final java.util.List<CustomSecurityAttributeAudit> value) {
        this.customSecurityAttributeAudits = value;
    }
    /**
     * Sets the directoryAudits property value. The directoryAudits property
     * @param value Value to set for the directoryAudits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryAudits(@javax.annotation.Nullable final java.util.List<DirectoryAudit> value) {
        this.directoryAudits = value;
    }
    /**
     * Sets the directoryProvisioning property value. The directoryProvisioning property
     * @param value Value to set for the directoryProvisioning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectoryProvisioning(@javax.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this.directoryProvisioning = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the provisioning property value. The provisioning property
     * @param value Value to set for the provisioning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioning(@javax.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this.provisioning = value;
    }
    /**
     * Sets the signIns property value. The signIns property
     * @param value Value to set for the signIns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignIns(@javax.annotation.Nullable final java.util.List<SignIn> value) {
        this.signIns = value;
    }
}
