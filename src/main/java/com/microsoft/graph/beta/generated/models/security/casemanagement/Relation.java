package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Relation extends CaseManagementEntity implements Parsable {
    /**
     * Instantiates a new {@link Relation} and sets the default values.
     */
    public Relation() {
        super();
        this.setOdataType("#microsoft.graph.security.caseManagement.relation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Relation}
     */
    @jakarta.annotation.Nonnull
    public static Relation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.caseManagement.incidentRelation": return new IncidentRelation();
                case "#microsoft.graph.security.caseManagement.recommendationRelation": return new RecommendationRelation();
                case "#microsoft.graph.security.caseManagement.workspaceIndicatorRelation": return new WorkspaceIndicatorRelation();
            }
        }
        return new Relation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("relatedResourceId", (n) -> { this.setRelatedResourceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the relatedResourceId property value. The identifier of the related external resource.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelatedResourceId() {
        return this.backingStore.get("relatedResourceId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("relatedResourceId", this.getRelatedResourceId());
    }
    /**
     * Sets the relatedResourceId property value. The identifier of the related external resource.
     * @param value Value to set for the relatedResourceId property.
     */
    public void setRelatedResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("relatedResourceId", value);
    }
}
