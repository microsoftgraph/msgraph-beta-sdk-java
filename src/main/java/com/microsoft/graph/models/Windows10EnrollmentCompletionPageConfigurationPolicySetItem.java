package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for Windows10EnrollmentCompletionPageConfiguration PolicySetItem.
 */
public class Windows10EnrollmentCompletionPageConfigurationPolicySetItem extends PolicySetItem implements Parsable {
    /**
     * Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.
     */
    private Integer priority;
    /**
     * Instantiates a new windows10EnrollmentCompletionPageConfigurationPolicySetItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Windows10EnrollmentCompletionPageConfigurationPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windows10EnrollmentCompletionPageConfigurationPolicySetItem
     */
    @javax.annotation.Nonnull
    public static Windows10EnrollmentCompletionPageConfigurationPolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10EnrollmentCompletionPageConfigurationPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("priority", (n) -> { this.setPriority(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the priority property value. Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this.priority;
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
        writer.writeIntegerValue("priority", this.getPriority());
    }
    /**
     * Sets the priority property value. Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this.priority = value;
    }
}
