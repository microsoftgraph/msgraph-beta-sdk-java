package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppliedCategory extends FilePlanDescriptorBase implements Parsable {
    /**
     * Represents the file plan descriptor for a subcategory under a specific category, which has been assigned to a particular retention label.
     */
    private SubCategory subCategory;
    /**
     * Instantiates a new appliedCategory and sets the default values.
     */
    public AppliedCategory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appliedCategory
     */
    @jakarta.annotation.Nonnull
    public static AppliedCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppliedCategory();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("subCategory", (n) -> { this.setSubCategory(n.getObjectValue(SubCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the subCategory property value. Represents the file plan descriptor for a subcategory under a specific category, which has been assigned to a particular retention label.
     * @return a subCategory
     */
    @jakarta.annotation.Nullable
    public SubCategory getSubCategory() {
        return this.subCategory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("subCategory", this.getSubCategory());
    }
    /**
     * Sets the subCategory property value. Represents the file plan descriptor for a subcategory under a specific category, which has been assigned to a particular retention label.
     * @param value Value to set for the subCategory property.
     */
    public void setSubCategory(@jakarta.annotation.Nullable final SubCategory value) {
        this.subCategory = value;
    }
}
