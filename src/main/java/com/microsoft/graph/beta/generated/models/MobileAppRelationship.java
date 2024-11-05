package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link MobileAppRelationship} and sets the default values.
     */
    public MobileAppRelationship() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppRelationship}
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
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sourceDisplayName", (n) -> { this.setSourceDisplayName(n.getStringValue()); });
        deserializerMap.put("sourceDisplayVersion", (n) -> { this.setSourceDisplayVersion(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("sourcePublisherDisplayName", (n) -> { this.setSourcePublisherDisplayName(n.getStringValue()); });
        deserializerMap.put("targetDisplayName", (n) -> { this.setTargetDisplayName(n.getStringValue()); });
        deserializerMap.put("targetDisplayVersion", (n) -> { this.setTargetDisplayVersion(n.getStringValue()); });
        deserializerMap.put("targetId", (n) -> { this.setTargetId(n.getStringValue()); });
        deserializerMap.put("targetPublisher", (n) -> { this.setTargetPublisher(n.getStringValue()); });
        deserializerMap.put("targetPublisherDisplayName", (n) -> { this.setTargetPublisherDisplayName(n.getStringValue()); });
        deserializerMap.put("targetType", (n) -> { this.setTargetType(n.getEnumValue(MobileAppRelationshipType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceDisplayName property value. The display name of the app that is the source of the mobile app relationship entity. For example: Orca. Maximum length is 500 characters. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceDisplayName() {
        return this.backingStore.get("sourceDisplayName");
    }
    /**
     * Gets the sourceDisplayVersion property value. The display version of the app that is the source of the mobile app relationship entity. For example 1.0.12 or 1.2203.156 or 3. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceDisplayVersion() {
        return this.backingStore.get("sourceDisplayVersion");
    }
    /**
     * Gets the sourceId property value. The unique app identifier of the source of the mobile app relationship entity. For example: 2dbc75b9-e993-4e4d-a071-91ac5a218672. If null during relationship creation, then it will be populated with parent Id. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.backingStore.get("sourceId");
    }
    /**
     * Gets the sourcePublisherDisplayName property value. The publisher display name of the app that is the source of the mobile app relationship entity. For example: Fabrikam. Maximum length is 500 characters. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourcePublisherDisplayName() {
        return this.backingStore.get("sourcePublisherDisplayName");
    }
    /**
     * Gets the targetDisplayName property value. The display name of the app that is the target of the mobile app relationship entity. Read-Only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetDisplayName() {
        return this.backingStore.get("targetDisplayName");
    }
    /**
     * Gets the targetDisplayVersion property value. The display version of the app that is the target of the mobile app relationship entity. Read-Only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetDisplayVersion() {
        return this.backingStore.get("targetDisplayVersion");
    }
    /**
     * Gets the targetId property value. App ID of the app that is the target of the mobile app relationship entity. Read-Only
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetId() {
        return this.backingStore.get("targetId");
    }
    /**
     * Gets the targetPublisher property value. The publisher of the app that is the target of the mobile app relationship entity. Read-Only. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetPublisher() {
        return this.backingStore.get("targetPublisher");
    }
    /**
     * Gets the targetPublisherDisplayName property value. The publisher display name of the app that is the target of the mobile app relationship entity. For example: Fabrikam. Maximum length is 500 characters. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetPublisherDisplayName() {
        return this.backingStore.get("targetPublisherDisplayName");
    }
    /**
     * Gets the targetType property value. Indicates whether the target of a relationship is the parent or the child in the relationship.
     * @return a {@link MobileAppRelationshipType}
     */
    @jakarta.annotation.Nullable
    public MobileAppRelationshipType getTargetType() {
        return this.backingStore.get("targetType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetId", this.getTargetId());
        writer.writeEnumValue("targetType", this.getTargetType());
    }
    /**
     * Sets the sourceDisplayName property value. The display name of the app that is the source of the mobile app relationship entity. For example: Orca. Maximum length is 500 characters. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @param value Value to set for the sourceDisplayName property.
     */
    public void setSourceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceDisplayName", value);
    }
    /**
     * Sets the sourceDisplayVersion property value. The display version of the app that is the source of the mobile app relationship entity. For example 1.0.12 or 1.2203.156 or 3. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @param value Value to set for the sourceDisplayVersion property.
     */
    public void setSourceDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceDisplayVersion", value);
    }
    /**
     * Sets the sourceId property value. The unique app identifier of the source of the mobile app relationship entity. For example: 2dbc75b9-e993-4e4d-a071-91ac5a218672. If null during relationship creation, then it will be populated with parent Id. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceId", value);
    }
    /**
     * Sets the sourcePublisherDisplayName property value. The publisher display name of the app that is the source of the mobile app relationship entity. For example: Fabrikam. Maximum length is 500 characters. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @param value Value to set for the sourcePublisherDisplayName property.
     */
    public void setSourcePublisherDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourcePublisherDisplayName", value);
    }
    /**
     * Sets the targetDisplayName property value. The display name of the app that is the target of the mobile app relationship entity. Read-Only. This property is read-only.
     * @param value Value to set for the targetDisplayName property.
     */
    public void setTargetDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetDisplayName", value);
    }
    /**
     * Sets the targetDisplayVersion property value. The display version of the app that is the target of the mobile app relationship entity. Read-Only. This property is read-only.
     * @param value Value to set for the targetDisplayVersion property.
     */
    public void setTargetDisplayVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetDisplayVersion", value);
    }
    /**
     * Sets the targetId property value. App ID of the app that is the target of the mobile app relationship entity. Read-Only
     * @param value Value to set for the targetId property.
     */
    public void setTargetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetId", value);
    }
    /**
     * Sets the targetPublisher property value. The publisher of the app that is the target of the mobile app relationship entity. Read-Only. This property is read-only.
     * @param value Value to set for the targetPublisher property.
     */
    public void setTargetPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetPublisher", value);
    }
    /**
     * Sets the targetPublisherDisplayName property value. The publisher display name of the app that is the target of the mobile app relationship entity. For example: Fabrikam. Maximum length is 500 characters. Read-Only. Supports: $select. Does not support $search, $filter, $orderBy. This property is read-only.
     * @param value Value to set for the targetPublisherDisplayName property.
     */
    public void setTargetPublisherDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetPublisherDisplayName", value);
    }
    /**
     * Sets the targetType property value. Indicates whether the target of a relationship is the parent or the child in the relationship.
     * @param value Value to set for the targetType property.
     */
    public void setTargetType(@jakarta.annotation.Nullable final MobileAppRelationshipType value) {
        this.backingStore.set("targetType", value);
    }
}
