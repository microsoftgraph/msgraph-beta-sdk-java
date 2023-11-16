package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Connectivity extends Entity implements Parsable {
    /**
     * Instantiates a new Connectivity and sets the default values.
     */
    public Connectivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Connectivity
     */
    @jakarta.annotation.Nonnull
    public static Connectivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Connectivity();
    }
    /**
     * Gets the branches property value. Branches represent locations for connectivity.
     * @return a java.util.List<BranchSite>
     */
    @jakarta.annotation.Nullable
    public java.util.List<BranchSite> getBranches() {
        return this.BackingStore.get("branches");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("branches", (n) -> { this.setBranches(n.getCollectionOfObjectValues(BranchSite::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("branches", this.getBranches());
    }
    /**
     * Sets the branches property value. Branches represent locations for connectivity.
     * @param value Value to set for the branches property.
     */
    public void setBranches(@jakarta.annotation.Nullable final java.util.List<BranchSite> value) {
        this.BackingStore.set("branches", value);
    }
}
