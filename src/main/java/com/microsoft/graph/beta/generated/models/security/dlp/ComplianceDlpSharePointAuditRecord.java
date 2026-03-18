package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceDlpSharePointAuditRecord extends ComplianceDLPBaseAuditRecord implements Parsable {
    /**
     * Instantiates a new {@link ComplianceDlpSharePointAuditRecord} and sets the default values.
     */
    public ComplianceDlpSharePointAuditRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.dlp.complianceDlpSharePointAuditRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComplianceDlpSharePointAuditRecord}
     */
    @jakarta.annotation.Nonnull
    public static ComplianceDlpSharePointAuditRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplianceDlpSharePointAuditRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sharePointMetaData", (n) -> { this.setSharePointMetaData(n.getObjectValue(SharePointMetaDataInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sharePointMetaData property value. The sharePointMetaData property
     * @return a {@link SharePointMetaDataInfo}
     */
    @jakarta.annotation.Nullable
    public SharePointMetaDataInfo getSharePointMetaData() {
        return this.backingStore.get("sharePointMetaData");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("sharePointMetaData", this.getSharePointMetaData());
    }
    /**
     * Sets the sharePointMetaData property value. The sharePointMetaData property
     * @param value Value to set for the sharePointMetaData property.
     */
    public void setSharePointMetaData(@jakarta.annotation.Nullable final SharePointMetaDataInfo value) {
        this.backingStore.set("sharePointMetaData", value);
    }
}
