package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes a dependency type between two mobile apps.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileAppDependency extends MobileAppRelationship implements Parsable {
    /**
     * Instantiates a new {@link MobileAppDependency} and sets the default values.
     */
    public MobileAppDependency() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppDependency");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileAppDependency}
     */
    @jakarta.annotation.Nonnull
    public static MobileAppDependency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppDependency();
    }
    /**
     * Gets the dependencyType property value. Indicates the dependency type associated with a relationship between two mobile apps.
     * @return a {@link MobileAppDependencyType}
     */
    @jakarta.annotation.Nullable
    public MobileAppDependencyType getDependencyType() {
        return this.backingStore.get("dependencyType");
    }
    /**
     * Gets the dependentAppCount property value. The total number of apps that directly or indirectly depend on the parent app. Read-Only. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDependentAppCount() {
        return this.backingStore.get("dependentAppCount");
    }
    /**
     * Gets the dependsOnAppCount property value. The total number of apps the child app directly or indirectly depends on. Read-Only. This property is read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDependsOnAppCount() {
        return this.backingStore.get("dependsOnAppCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dependencyType", (n) -> { this.setDependencyType(n.getEnumValue(MobileAppDependencyType::forValue)); });
        deserializerMap.put("dependentAppCount", (n) -> { this.setDependentAppCount(n.getIntegerValue()); });
        deserializerMap.put("dependsOnAppCount", (n) -> { this.setDependsOnAppCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("dependencyType", this.getDependencyType());
    }
    /**
     * Sets the dependencyType property value. Indicates the dependency type associated with a relationship between two mobile apps.
     * @param value Value to set for the dependencyType property.
     */
    public void setDependencyType(@jakarta.annotation.Nullable final MobileAppDependencyType value) {
        this.backingStore.set("dependencyType", value);
    }
    /**
     * Sets the dependentAppCount property value. The total number of apps that directly or indirectly depend on the parent app. Read-Only. This property is read-only.
     * @param value Value to set for the dependentAppCount property.
     */
    public void setDependentAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dependentAppCount", value);
    }
    /**
     * Sets the dependsOnAppCount property value. The total number of apps the child app directly or indirectly depends on. Read-Only. This property is read-only.
     * @param value Value to set for the dependsOnAppCount property.
     */
    public void setDependsOnAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("dependsOnAppCount", value);
    }
}
