package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssociatedBranch extends Association implements Parsable {
    /**
     * Instantiates a new AssociatedBranch and sets the default values.
     */
    public AssociatedBranch() {
        super();
        this.setOdataType("#microsoft.graph.networkaccess.associatedBranch");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssociatedBranch
     */
    @jakarta.annotation.Nonnull
    public static AssociatedBranch createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssociatedBranch();
    }
    /**
     * Gets the branchId property value. Identifier for the branch.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBranchId() {
        return this.backingStore.get("branchId");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("branchId", (n) -> { this.setBranchId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("branchId", this.getBranchId());
    }
    /**
     * Sets the branchId property value. Identifier for the branch.
     * @param value Value to set for the branchId property.
     */
    public void setBranchId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("branchId", value);
    }
}
