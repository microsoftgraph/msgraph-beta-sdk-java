package com.microsoft.graph.devicemanagement.androidmanagedstoreaccountenterprisesettings.approveapps;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ApproveAppsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The approveAllPermissions property
     */
    private Boolean approveAllPermissions;
    /**
     * The packageIds property
     */
    private java.util.List<String> packageIds;
    /**
     * Instantiates a new approveAppsPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ApproveAppsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a approveAppsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ApproveAppsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApproveAppsPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the approveAllPermissions property value. The approveAllPermissions property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getApproveAllPermissions() {
        return this.approveAllPermissions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("approveAllPermissions", (n) -> { this.setApproveAllPermissions(n.getBooleanValue()); });
        deserializerMap.put("packageIds", (n) -> { this.setPackageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the packageIds property value. The packageIds property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("approveAllPermissions", this.getApproveAllPermissions());
        writer.writeCollectionOfPrimitiveValues("packageIds", this.getPackageIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the approveAllPermissions property value. The approveAllPermissions property
     * @param value Value to set for the approveAllPermissions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApproveAllPermissions(@jakarta.annotation.Nullable final Boolean value) {
        this.approveAllPermissions = value;
    }
    /**
     * Sets the packageIds property value. The packageIds property
     * @param value Value to set for the packageIds property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPackageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.packageIds = value;
    }
}
