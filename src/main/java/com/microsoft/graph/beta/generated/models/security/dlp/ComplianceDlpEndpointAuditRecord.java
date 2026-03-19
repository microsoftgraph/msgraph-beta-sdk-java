package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceDlpEndpointAuditRecord extends ComplianceDLPBaseAuditRecord implements Parsable {
    /**
     * Instantiates a new {@link ComplianceDlpEndpointAuditRecord} and sets the default values.
     */
    public ComplianceDlpEndpointAuditRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.dlp.complianceDlpEndpointAuditRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComplianceDlpEndpointAuditRecord}
     */
    @jakarta.annotation.Nonnull
    public static ComplianceDlpEndpointAuditRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplianceDlpEndpointAuditRecord();
    }
    /**
     * Gets the authorizedGroup property value. The authorizedGroup property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthorizedGroup() {
        return this.backingStore.get("authorizedGroup");
    }
    /**
     * Gets the endpointMetaData property value. The endpointMetaData property
     * @return a {@link EndpointMetaDataInfo}
     */
    @jakarta.annotation.Nullable
    public EndpointMetaDataInfo getEndpointMetaData() {
        return this.backingStore.get("endpointMetaData");
    }
    /**
     * Gets the evidenceFile property value. The evidenceFile property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvidenceFile() {
        return this.backingStore.get("evidenceFile");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authorizedGroup", (n) -> { this.setAuthorizedGroup(n.getStringValue()); });
        deserializerMap.put("endpointMetaData", (n) -> { this.setEndpointMetaData(n.getObjectValue(EndpointMetaDataInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("evidenceFile", (n) -> { this.setEvidenceFile(n.getStringValue()); });
        deserializerMap.put("networkLocationContextInAction", (n) -> { this.setNetworkLocationContextInAction(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkLocationContextInAction property value. The networkLocationContextInAction property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNetworkLocationContextInAction() {
        return this.backingStore.get("networkLocationContextInAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authorizedGroup", this.getAuthorizedGroup());
        writer.writeObjectValue("endpointMetaData", this.getEndpointMetaData());
        writer.writeStringValue("evidenceFile", this.getEvidenceFile());
        writer.writeStringValue("networkLocationContextInAction", this.getNetworkLocationContextInAction());
    }
    /**
     * Sets the authorizedGroup property value. The authorizedGroup property
     * @param value Value to set for the authorizedGroup property.
     */
    public void setAuthorizedGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("authorizedGroup", value);
    }
    /**
     * Sets the endpointMetaData property value. The endpointMetaData property
     * @param value Value to set for the endpointMetaData property.
     */
    public void setEndpointMetaData(@jakarta.annotation.Nullable final EndpointMetaDataInfo value) {
        this.backingStore.set("endpointMetaData", value);
    }
    /**
     * Sets the evidenceFile property value. The evidenceFile property
     * @param value Value to set for the evidenceFile property.
     */
    public void setEvidenceFile(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("evidenceFile", value);
    }
    /**
     * Sets the networkLocationContextInAction property value. The networkLocationContextInAction property
     * @param value Value to set for the networkLocationContextInAction property.
     */
    public void setNetworkLocationContextInAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("networkLocationContextInAction", value);
    }
}
