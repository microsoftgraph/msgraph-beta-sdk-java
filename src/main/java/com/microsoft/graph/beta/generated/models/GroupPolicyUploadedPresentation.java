package com.microsoft.graph.beta.models;

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
public class GroupPolicyUploadedPresentation extends GroupPolicyPresentation implements Parsable {
    /**
     * Instantiates a new {@link GroupPolicyUploadedPresentation} and sets the default values.
     */
    public GroupPolicyUploadedPresentation() {
        super();
        this.setOdataType("#microsoft.graph.groupPolicyUploadedPresentation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GroupPolicyUploadedPresentation}
     */
    @jakarta.annotation.Nonnull
    public static GroupPolicyUploadedPresentation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.groupPolicyPresentationCheckBox": return new GroupPolicyPresentationCheckBox();
                case "#microsoft.graph.groupPolicyPresentationComboBox": return new GroupPolicyPresentationComboBox();
                case "#microsoft.graph.groupPolicyPresentationDecimalTextBox": return new GroupPolicyPresentationDecimalTextBox();
                case "#microsoft.graph.groupPolicyPresentationDropdownList": return new GroupPolicyPresentationDropdownList();
                case "#microsoft.graph.groupPolicyPresentationListBox": return new GroupPolicyPresentationListBox();
                case "#microsoft.graph.groupPolicyPresentationLongDecimalTextBox": return new GroupPolicyPresentationLongDecimalTextBox();
                case "#microsoft.graph.groupPolicyPresentationMultiTextBox": return new GroupPolicyPresentationMultiTextBox();
                case "#microsoft.graph.groupPolicyPresentationText": return new GroupPolicyPresentationText();
                case "#microsoft.graph.groupPolicyPresentationTextBox": return new GroupPolicyPresentationTextBox();
            }
        }
        return new GroupPolicyUploadedPresentation();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
    }
}
