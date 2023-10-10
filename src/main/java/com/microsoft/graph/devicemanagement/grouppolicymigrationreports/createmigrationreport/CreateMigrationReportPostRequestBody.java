package com.microsoft.graph.devicemanagement.grouppolicymigrationreports.createmigrationreport;

import com.microsoft.graph.models.GroupPolicyObjectFile;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateMigrationReportPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The groupPolicyObjectFile property
     */
    private GroupPolicyObjectFile groupPolicyObjectFile;
    /**
     * Instantiates a new CreateMigrationReportPostRequestBody and sets the default values.
     */
    public CreateMigrationReportPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateMigrationReportPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static CreateMigrationReportPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateMigrationReportPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("groupPolicyObjectFile", (n) -> { this.setGroupPolicyObjectFile(n.getObjectValue(GroupPolicyObjectFile::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupPolicyObjectFile property value. The groupPolicyObjectFile property
     * @return a GroupPolicyObjectFile
     */
    @jakarta.annotation.Nullable
    public GroupPolicyObjectFile getGroupPolicyObjectFile() {
        return this.groupPolicyObjectFile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("groupPolicyObjectFile", this.getGroupPolicyObjectFile());
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
     * Sets the groupPolicyObjectFile property value. The groupPolicyObjectFile property
     * @param value Value to set for the groupPolicyObjectFile property.
     */
    public void setGroupPolicyObjectFile(@jakarta.annotation.Nullable final GroupPolicyObjectFile value) {
        this.groupPolicyObjectFile = value;
    }
}
