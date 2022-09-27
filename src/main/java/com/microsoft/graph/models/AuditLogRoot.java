package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuditLogRoot implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The directoryAudits property */
    private java.util.List<DirectoryAudit> _directoryAudits;
    /** The directoryProvisioning property */
    private java.util.List<ProvisioningObjectSummary> _directoryProvisioning;
    /** The OdataType property */
    private String _odataType;
    /** The provisioning property */
    private java.util.List<ProvisioningObjectSummary> _provisioning;
    /** The signIns property */
    private java.util.List<SignIn> _signIns;
    /**
     * Instantiates a new AuditLogRoot and sets the default values.
     * @return a void
     */
    public AuditLogRoot() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.auditLogRoot");
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
        return this._additionalData;
    }
    /**
     * Gets the directoryAudits property value. The directoryAudits property
     * @return a directoryAudit
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryAudit> getDirectoryAudits() {
        return this._directoryAudits;
    }
    /**
     * Gets the directoryProvisioning property value. The directoryProvisioning property
     * @return a provisioningObjectSummary
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getDirectoryProvisioning() {
        return this._directoryProvisioning;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AuditLogRoot currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("directoryAudits", (n) -> { currentObject.setDirectoryAudits(n.getCollectionOfObjectValues(DirectoryAudit::createFromDiscriminatorValue)); });
            this.put("directoryProvisioning", (n) -> { currentObject.setDirectoryProvisioning(n.getCollectionOfObjectValues(ProvisioningObjectSummary::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("provisioning", (n) -> { currentObject.setProvisioning(n.getCollectionOfObjectValues(ProvisioningObjectSummary::createFromDiscriminatorValue)); });
            this.put("signIns", (n) -> { currentObject.setSignIns(n.getCollectionOfObjectValues(SignIn::createFromDiscriminatorValue)); });
        }};
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
     * Gets the provisioning property value. The provisioning property
     * @return a provisioningObjectSummary
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisioningObjectSummary> getProvisioning() {
        return this._provisioning;
    }
    /**
     * Gets the signIns property value. The signIns property
     * @return a signIn
     */
    @javax.annotation.Nullable
    public java.util.List<SignIn> getSignIns() {
        return this._signIns;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the directoryAudits property value. The directoryAudits property
     * @param value Value to set for the directoryAudits property.
     * @return a void
     */
    public void setDirectoryAudits(@javax.annotation.Nullable final java.util.List<DirectoryAudit> value) {
        this._directoryAudits = value;
    }
    /**
     * Sets the directoryProvisioning property value. The directoryProvisioning property
     * @param value Value to set for the directoryProvisioning property.
     * @return a void
     */
    public void setDirectoryProvisioning(@javax.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this._directoryProvisioning = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the provisioning property value. The provisioning property
     * @param value Value to set for the provisioning property.
     * @return a void
     */
    public void setProvisioning(@javax.annotation.Nullable final java.util.List<ProvisioningObjectSummary> value) {
        this._provisioning = value;
    }
    /**
     * Sets the signIns property value. The signIns property
     * @param value Value to set for the signIns property.
     * @return a void
     */
    public void setSignIns(@javax.annotation.Nullable final java.util.List<SignIn> value) {
        this._signIns = value;
    }
}
