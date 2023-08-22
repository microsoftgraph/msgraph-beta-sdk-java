package com.microsoft.graph.devicemanagement.sendcustomnotificationtocompanyportal;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendCustomNotificationToCompanyPortalPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The groupsToNotify property
     */
    private java.util.List<String> groupsToNotify;
    /**
     * The notificationBody property
     */
    private String notificationBody;
    /**
     * The notificationTitle property
     */
    private String notificationTitle;
    /**
     * Instantiates a new sendCustomNotificationToCompanyPortalPostRequestBody and sets the default values.
     */
    public SendCustomNotificationToCompanyPortalPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sendCustomNotificationToCompanyPortalPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SendCustomNotificationToCompanyPortalPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendCustomNotificationToCompanyPortalPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("groupsToNotify", (n) -> { this.setGroupsToNotify(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notificationBody", (n) -> { this.setNotificationBody(n.getStringValue()); });
        deserializerMap.put("notificationTitle", (n) -> { this.setNotificationTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupsToNotify property value. The groupsToNotify property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGroupsToNotify() {
        return this.groupsToNotify;
    }
    /**
     * Gets the notificationBody property value. The notificationBody property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotificationBody() {
        return this.notificationBody;
    }
    /**
     * Gets the notificationTitle property value. The notificationTitle property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getNotificationTitle() {
        return this.notificationTitle;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("groupsToNotify", this.getGroupsToNotify());
        writer.writeStringValue("notificationBody", this.getNotificationBody());
        writer.writeStringValue("notificationTitle", this.getNotificationTitle());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the groupsToNotify property value. The groupsToNotify property
     * @param value Value to set for the groupsToNotify property.
     */
    public void setGroupsToNotify(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.groupsToNotify = value;
    }
    /**
     * Sets the notificationBody property value. The notificationBody property
     * @param value Value to set for the notificationBody property.
     */
    public void setNotificationBody(@jakarta.annotation.Nullable final String value) {
        this.notificationBody = value;
    }
    /**
     * Sets the notificationTitle property value. The notificationTitle property
     * @param value Value to set for the notificationTitle property.
     */
    public void setNotificationTitle(@jakarta.annotation.Nullable final String value) {
        this.notificationTitle = value;
    }
}
