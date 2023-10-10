package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomExtensionHandler extends Entity implements Parsable {
    /**
     * Indicates which custom workflow extension is executed at this stage. Nullable. Supports $expand.
     */
    private CustomAccessPackageWorkflowExtension customExtension;
    /**
     * Indicates the stage of the access package assignment request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     */
    private AccessPackageCustomExtensionStage stage;
    /**
     * Instantiates a new CustomExtensionHandler and sets the default values.
     */
    public CustomExtensionHandler() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomExtensionHandler
     */
    @jakarta.annotation.Nonnull
    public static CustomExtensionHandler createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionHandler();
    }
    /**
     * Gets the customExtension property value. Indicates which custom workflow extension is executed at this stage. Nullable. Supports $expand.
     * @return a CustomAccessPackageWorkflowExtension
     */
    @jakarta.annotation.Nullable
    public CustomAccessPackageWorkflowExtension getCustomExtension() {
        return this.customExtension;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("customExtension", (n) -> { this.setCustomExtension(n.getObjectValue(CustomAccessPackageWorkflowExtension::createFromDiscriminatorValue)); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(AccessPackageCustomExtensionStage.class)); });
        return deserializerMap;
    }
    /**
     * Gets the stage property value. Indicates the stage of the access package assignment request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @return a AccessPackageCustomExtensionStage
     */
    @jakarta.annotation.Nullable
    public AccessPackageCustomExtensionStage getStage() {
        return this.stage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("customExtension", this.getCustomExtension());
        writer.writeEnumValue("stage", this.getStage());
    }
    /**
     * Sets the customExtension property value. Indicates which custom workflow extension is executed at this stage. Nullable. Supports $expand.
     * @param value Value to set for the customExtension property.
     */
    public void setCustomExtension(@jakarta.annotation.Nullable final CustomAccessPackageWorkflowExtension value) {
        this.customExtension = value;
    }
    /**
     * Sets the stage property value. Indicates the stage of the access package assignment request workflow when the access package custom extension runs. The possible values are: assignmentRequestCreated, assignmentRequestApproved, assignmentRequestGranted, assignmentRequestRemoved, assignmentFourteenDaysBeforeExpiration, assignmentOneDayBeforeExpiration, unknownFutureValue.
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final AccessPackageCustomExtensionStage value) {
        this.stage = value;
    }
}
