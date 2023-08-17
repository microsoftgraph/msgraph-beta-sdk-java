package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TenantRelationshipAccessPolicyBase extends PolicyBase implements Parsable {
    /**
     * The definition property
     */
    private java.util.List<String> definition;
    /**
     * Instantiates a new tenantRelationshipAccessPolicyBase and sets the default values.
     */
    public TenantRelationshipAccessPolicyBase() {
        super();
        this.setOdataType("#microsoft.graph.tenantRelationshipAccessPolicyBase");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tenantRelationshipAccessPolicyBase
     */
    @jakarta.annotation.Nonnull
    public static TenantRelationshipAccessPolicyBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.crossTenantAccessPolicy": return new CrossTenantAccessPolicy();
            }
        }
        return new TenantRelationshipAccessPolicyBase();
    }
    /**
     * Gets the definition property value. The definition property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefinition() {
        return this.definition;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("definition", (n) -> { this.setDefinition(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("definition", this.getDefinition());
    }
    /**
     * Sets the definition property value. The definition property
     * @param value Value to set for the definition property.
     */
    public void setDefinition(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.definition = value;
    }
}
