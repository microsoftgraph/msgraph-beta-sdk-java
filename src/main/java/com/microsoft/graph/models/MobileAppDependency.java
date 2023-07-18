package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes a dependency type between two mobile apps.
 */
public class MobileAppDependency extends MobileAppRelationship implements Parsable {
    /**
     * Indicates the dependency type associated with a relationship between two mobile apps.
     */
    private MobileAppDependencyType dependencyType;
    /**
     * The total number of apps that directly or indirectly depend on the parent app.
     */
    private Integer dependentAppCount;
    /**
     * The total number of apps the child app directly or indirectly depends on.
     */
    private Integer dependsOnAppCount;
    /**
     * Instantiates a new mobileAppDependency and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppDependency() {
        super();
        this.setOdataType("#microsoft.graph.mobileAppDependency");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppDependency
     */
    @javax.annotation.Nonnull
    public static MobileAppDependency createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppDependency();
    }
    /**
     * Gets the dependencyType property value. Indicates the dependency type associated with a relationship between two mobile apps.
     * @return a mobileAppDependencyType
     */
    @javax.annotation.Nullable
    public MobileAppDependencyType getDependencyType() {
        return this.dependencyType;
    }
    /**
     * Gets the dependentAppCount property value. The total number of apps that directly or indirectly depend on the parent app.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDependentAppCount() {
        return this.dependentAppCount;
    }
    /**
     * Gets the dependsOnAppCount property value. The total number of apps the child app directly or indirectly depends on.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDependsOnAppCount() {
        return this.dependsOnAppCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dependencyType", (n) -> { this.setDependencyType(n.getEnumValue(MobileAppDependencyType.class)); });
        deserializerMap.put("dependentAppCount", (n) -> { this.setDependentAppCount(n.getIntegerValue()); });
        deserializerMap.put("dependsOnAppCount", (n) -> { this.setDependsOnAppCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("dependencyType", this.getDependencyType());
        writer.writeIntegerValue("dependentAppCount", this.getDependentAppCount());
        writer.writeIntegerValue("dependsOnAppCount", this.getDependsOnAppCount());
    }
    /**
     * Sets the dependencyType property value. Indicates the dependency type associated with a relationship between two mobile apps.
     * @param value Value to set for the dependencyType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDependencyType(@javax.annotation.Nullable final MobileAppDependencyType value) {
        this.dependencyType = value;
    }
    /**
     * Sets the dependentAppCount property value. The total number of apps that directly or indirectly depend on the parent app.
     * @param value Value to set for the dependentAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDependentAppCount(@javax.annotation.Nullable final Integer value) {
        this.dependentAppCount = value;
    }
    /**
     * Sets the dependsOnAppCount property value. The total number of apps the child app directly or indirectly depends on.
     * @param value Value to set for the dependsOnAppCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDependsOnAppCount(@javax.annotation.Nullable final Integer value) {
        this.dependsOnAppCount = value;
    }
}
