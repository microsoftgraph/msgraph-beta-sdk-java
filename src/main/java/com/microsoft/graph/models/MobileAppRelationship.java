package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes a relationship between two mobile apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppRelationship extends Entity implements Parsable {
    /**
     * The target mobile app's display name.
     */
    private String targetDisplayName;
    /**
     * The target mobile app's display version.
     */
    private String targetDisplayVersion;
    /**
     * The target mobile app's app id.
     */
    private String targetId;
    /**
     * The target mobile app's publisher.
     */
    private String targetPublisher;
    /**
     * Indicates whether the target of a relationship is the parent or the child in the relationship.
     */
    private MobileAppRelationshipType targetType;
    /**
     * Instantiates a new mobileAppRelationship and sets the default values.
     */
    public MobileAppRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppRelationship
     */
    @jakarta.annotation.Nonnull
    public static MobileAppRelationship createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.mobileAppDependency": return new MobileAppDependency();
                case "#microsoft.graph.mobileAppSupersedence": return new MobileAppSupersedence();
            }
        }
        return new MobileAppRelationship();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetDisplayName", (n) -> { this.setTargetDisplayName(n.getStringValue()); });
        deserializerMap.put("targetDisplayVersion", (n) -> { this.setTargetDisplayVersion(n.getStringValue()); });
        deserializerMap.put("targetId", (n) -> { this.setTargetId(n.getStringValue()); });
        deserializerMap.put("targetPublisher", (n) -> { this.setTargetPublisher(n.getStringValue()); });
        deserializerMap.put("targetType", (n) -> { this.setTargetType(n.getEnumValue(MobileAppRelationshipType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the targetDisplayName property value. The target mobile app's display name.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetDisplayName() {
        return this.targetDisplayName;
    }
    /**
     * Gets the targetDisplayVersion property value. The target mobile app's display version.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetDisplayVersion() {
        return this.targetDisplayVersion;
    }
    /**
     * Gets the targetId property value. The target mobile app's app id.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * Gets the targetPublisher property value. The target mobile app's publisher.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTargetPublisher() {
        return this.targetPublisher;
    }
    /**
     * Gets the targetType property value. Indicates whether the target of a relationship is the parent or the child in the relationship.
     * @return a mobileAppRelationshipType
     */
    @jakarta.annotation.Nullable
    public MobileAppRelationshipType getTargetType() {
        return this.targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetDisplayName", this.getTargetDisplayName());
        writer.writeStringValue("targetDisplayVersion", this.getTargetDisplayVersion());
        writer.writeStringValue("targetId", this.getTargetId());
        writer.writeStringValue("targetPublisher", this.getTargetPublisher());
        writer.writeEnumValue("targetType", this.getTargetType());
    }
    /**
     * Sets the targetDisplayName property value. The target mobile app's display name.
     * @param value Value to set for the targetDisplayName property.
     */
    public void setTargetDisplayName(@jakarta.annotation.Nullable final String value) {
        this.targetDisplayName = value;
    }
    /**
     * Sets the targetDisplayVersion property value. The target mobile app's display version.
     * @param value Value to set for the targetDisplayVersion property.
     */
    public void setTargetDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.targetDisplayVersion = value;
    }
    /**
     * Sets the targetId property value. The target mobile app's app id.
     * @param value Value to set for the targetId property.
     */
    public void setTargetId(@jakarta.annotation.Nullable final String value) {
        this.targetId = value;
    }
    /**
     * Sets the targetPublisher property value. The target mobile app's publisher.
     * @param value Value to set for the targetPublisher property.
     */
    public void setTargetPublisher(@jakarta.annotation.Nullable final String value) {
        this.targetPublisher = value;
    }
    /**
     * Sets the targetType property value. Indicates whether the target of a relationship is the parent or the child in the relationship.
     * @param value Value to set for the targetType property.
     */
    public void setTargetType(@jakarta.annotation.Nullable final MobileAppRelationshipType value) {
        this.targetType = value;
    }
}
