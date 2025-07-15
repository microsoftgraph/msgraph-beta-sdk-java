package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CaseOperation} and sets the default values.
     */
    public CaseOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseOperation}
     */
    @jakarta.annotation.Nonnull
    public static CaseOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.ediscoveryAddToReviewSetOperation": return new EdiscoveryAddToReviewSetOperation();
                case "#microsoft.graph.security.ediscoveryEstimateOperation": return new EdiscoveryEstimateOperation();
                case "#microsoft.graph.security.ediscoveryExportOperation": return new EdiscoveryExportOperation();
                case "#microsoft.graph.security.ediscoveryHoldOperation": return new EdiscoveryHoldOperation();
                case "#microsoft.graph.security.ediscoveryIndexOperation": return new EdiscoveryIndexOperation();
                case "#microsoft.graph.security.ediscoveryPurgeDataOperation": return new EdiscoveryPurgeDataOperation();
                case "#microsoft.graph.security.ediscoverySearchExportOperation": return new EdiscoverySearchExportOperation();
                case "#microsoft.graph.security.ediscoveryTagOperation": return new EdiscoveryTagOperation();
            }
        }
        return new CaseOperation();
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
