package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PermissionsAnalytics extends Entity implements Parsable {
    /**
     * Instantiates a new PermissionsAnalytics and sets the default values.
     */
    public PermissionsAnalytics() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PermissionsAnalytics
     */
    @jakarta.annotation.Nonnull
    public static PermissionsAnalytics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PermissionsAnalytics();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("findings", (n) -> { this.setFindings(n.getCollectionOfObjectValues(Finding::createFromDiscriminatorValue)); });
        deserializerMap.put("permissionsCreepIndexDistributions", (n) -> { this.setPermissionsCreepIndexDistributions(n.getCollectionOfObjectValues(PermissionsCreepIndexDistribution::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the findings property value. The findings property
     * @return a java.util.List<Finding>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Finding> getFindings() {
        return this.backingStore.get("findings");
    }
    /**
     * Gets the permissionsCreepIndexDistributions property value. The permissionsCreepIndexDistributions property
     * @return a java.util.List<PermissionsCreepIndexDistribution>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PermissionsCreepIndexDistribution> getPermissionsCreepIndexDistributions() {
        return this.backingStore.get("permissionsCreepIndexDistributions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("findings", this.getFindings());
        writer.writeCollectionOfObjectValues("permissionsCreepIndexDistributions", this.getPermissionsCreepIndexDistributions());
    }
    /**
     * Sets the findings property value. The findings property
     * @param value Value to set for the findings property.
     */
    public void setFindings(@jakarta.annotation.Nullable final java.util.List<Finding> value) {
        this.backingStore.set("findings", value);
    }
    /**
     * Sets the permissionsCreepIndexDistributions property value. The permissionsCreepIndexDistributions property
     * @param value Value to set for the permissionsCreepIndexDistributions property.
     */
    public void setPermissionsCreepIndexDistributions(@jakarta.annotation.Nullable final java.util.List<PermissionsCreepIndexDistribution> value) {
        this.backingStore.set("permissionsCreepIndexDistributions", value);
    }
}
