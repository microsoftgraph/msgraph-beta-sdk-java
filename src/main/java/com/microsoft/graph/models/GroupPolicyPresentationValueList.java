package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The entity represents a collection of name/value pairs of a list box presentation on a policy definition.
 */
public class GroupPolicyPresentationValueList extends GroupPolicyPresentationValue implements Parsable {
    /**
     * A list of pairs for the associated presentation.
     */
    private java.util.List<KeyValuePair> values;
    /**
     * Instantiates a new groupPolicyPresentationValueList and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public GroupPolicyPresentationValueList() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a groupPolicyPresentationValueList
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationValueList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationValueList();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("values", (n) -> { this.setValues(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the values property value. A list of pairs for the associated presentation.
     * @return a keyValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("values", this.getValues());
    }
    /**
     * Sets the values property value. A list of pairs for the associated presentation.
     * @param value Value to set for the values property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setValues(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.values = value;
    }
}
