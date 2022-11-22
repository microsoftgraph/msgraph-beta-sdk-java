package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GroupPolicyPresentationCheckBox extends GroupPolicyUploadedPresentation implements Parsable {
    /** Default value for the check box. The default value is false. */
    private Boolean _defaultChecked;
    /**
     * Instantiates a new GroupPolicyPresentationCheckBox and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GroupPolicyPresentationCheckBox() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyPresentationCheckBox");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GroupPolicyPresentationCheckBox
     */
    @javax.annotation.Nonnull
    public static GroupPolicyPresentationCheckBox createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GroupPolicyPresentationCheckBox();
    }
    /**
     * Gets the defaultChecked property value. Default value for the check box. The default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDefaultChecked() {
        return this._defaultChecked;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultChecked", (n) -> { this.setDefaultChecked(n.getBooleanValue()); });
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
        writer.writeBooleanValue("defaultChecked", this.getDefaultChecked());
    }
    /**
     * Sets the defaultChecked property value. Default value for the check box. The default value is false.
     * @param value Value to set for the defaultChecked property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultChecked(@javax.annotation.Nullable final Boolean value) {
        this._defaultChecked = value;
    }
}
