package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an ADMX checkBox element and an ADMX boolean element.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GroupPolicyPresentationCheckBox extends GroupPolicyUploadedPresentation implements Parsable {
    /**
     * Default value for the check box. The default value is false.
     */
    private Boolean defaultChecked;
    /**
     * Instantiates a new GroupPolicyPresentationCheckBox and sets the default values.
     */
    public GroupPolicyPresentationCheckBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationCheckBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationCheckBox
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyPresentationCheckBox createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationCheckBox();
    }
    /**
     * Gets the defaultChecked property value. Default value for the check box. The default value is false.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefaultChecked() {
        return this.defaultChecked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultChecked", (n) -> { this.setDefaultChecked(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("defaultChecked", this.getDefaultChecked());
    }
    /**
     * Sets the defaultChecked property value. Default value for the check box. The default value is false.
     * @param value Value to set for the defaultChecked property.
     */
    public void setDefaultChecked(@jakarta.annotation.Nullable final Boolean value) {
        this.defaultChecked = value;
    }
}
