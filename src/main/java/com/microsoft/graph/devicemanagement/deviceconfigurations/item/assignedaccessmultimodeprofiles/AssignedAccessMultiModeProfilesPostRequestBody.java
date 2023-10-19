package com.microsoft.graph.devicemanagement.deviceconfigurations.item.assignedaccessmultimodeprofiles;

import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignedAccessMultiModeProfilesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignedAccessMultiModeProfiles property
     */
    private java.util.List<WindowsAssignedAccessProfile> assignedAccessMultiModeProfiles;
    /**
     * Instantiates a new AssignedAccessMultiModeProfilesPostRequestBody and sets the default values.
     */
    public AssignedAccessMultiModeProfilesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssignedAccessMultiModeProfilesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static AssignedAccessMultiModeProfilesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignedAccessMultiModeProfilesPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the assignedAccessMultiModeProfiles property value. The assignedAccessMultiModeProfiles property
     * @return a java.util.List<WindowsAssignedAccessProfile>
     */
    @jakarta.annotation.Nullable
    public java.util.List<WindowsAssignedAccessProfile> getAssignedAccessMultiModeProfiles() {
        return this.assignedAccessMultiModeProfiles;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("assignedAccessMultiModeProfiles", (n) -> { this.setAssignedAccessMultiModeProfiles(n.getCollectionOfObjectValues(WindowsAssignedAccessProfile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("assignedAccessMultiModeProfiles", this.getAssignedAccessMultiModeProfiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the assignedAccessMultiModeProfiles property value. The assignedAccessMultiModeProfiles property
     * @param value Value to set for the assignedAccessMultiModeProfiles property.
     */
    public void setAssignedAccessMultiModeProfiles(@jakarta.annotation.Nullable final java.util.List<WindowsAssignedAccessProfile> value) {
        this.assignedAccessMultiModeProfiles = value;
    }
}
