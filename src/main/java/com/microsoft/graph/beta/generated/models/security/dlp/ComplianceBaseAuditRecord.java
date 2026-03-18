package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplianceBaseAuditRecord extends BaseAuditRecord implements Parsable {
    /**
     * Instantiates a new {@link ComplianceBaseAuditRecord} and sets the default values.
     */
    public ComplianceBaseAuditRecord() {
        super();
        this.setOdataType("#microsoft.graph.security.dlp.complianceBaseAuditRecord");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ComplianceBaseAuditRecord}
     */
    @jakarta.annotation.Nonnull
    public static ComplianceBaseAuditRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.dlp.complianceDLPBaseAuditRecord": return new ComplianceDLPBaseAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpEndpointAuditRecord": return new ComplianceDlpEndpointAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpExchangeAuditRecord": return new ComplianceDlpExchangeAuditRecord();
                case "#microsoft.graph.security.dlp.complianceDlpSharePointAuditRecord": return new ComplianceDlpSharePointAuditRecord();
            }
        }
        return new ComplianceBaseAuditRecord();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
