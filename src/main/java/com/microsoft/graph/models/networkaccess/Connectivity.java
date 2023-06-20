package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Connectivity extends Entity implements Parsable {
    /** The branches property */
    private java.util.List<BranchSite> branches;
    /**
     * Instantiates a new connectivity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Connectivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectivity
     */
    @javax.annotation.Nonnull
    public static Connectivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Connectivity();
    }
    /**
     * Gets the branches property value. The branches property
     * @return a branchSite
     */
    @javax.annotation.Nullable
    public java.util.List<BranchSite> getBranches() {
        return this.branches;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("branches", (n) -> { this.setBranches(n.getCollectionOfObjectValues(BranchSite::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("branches", this.getBranches());
    }
    /**
     * Sets the branches property value. The branches property
     * @param value Value to set for the branches property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBranches(@javax.annotation.Nullable final java.util.List<BranchSite> value) {
        this.branches = value;
    }
}
