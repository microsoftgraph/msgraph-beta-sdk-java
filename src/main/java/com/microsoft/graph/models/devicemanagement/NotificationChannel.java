package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NotificationChannel implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     */
    private NotificationChannelType notificationChannelType;
    /**
     * Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     */
    private java.util.List<NotificationReceiver> notificationReceivers;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The contact information about the notification receivers, such as email addresses. For portal notifications, receivers can be left blank. For email notifications, receivers consists of email addresses such as serena.davis@contoso.com.
     */
    private java.util.List<String> receivers;
    /**
     * Instantiates a new notificationChannel and sets the default values.
     */
    public NotificationChannel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a notificationChannel
     */
    @jakarta.annotation.Nonnull
    public static NotificationChannel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationChannel();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("notificationChannelType", (n) -> { this.setNotificationChannelType(n.getEnumValue(NotificationChannelType.class)); });
        deserializerMap.put("notificationReceivers", (n) -> { this.setNotificationReceivers(n.getCollectionOfObjectValues(NotificationReceiver::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("receivers", (n) -> { this.setReceivers(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the notificationChannelType property value. The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     * @return a notificationChannelType
     */
    @jakarta.annotation.Nullable
    public NotificationChannelType getNotificationChannelType() {
        return this.notificationChannelType;
    }
    /**
     * Gets the notificationReceivers property value. Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     * @return a notificationReceiver
     */
    @jakarta.annotation.Nullable
    public java.util.List<NotificationReceiver> getNotificationReceivers() {
        return this.notificationReceivers;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the receivers property value. The contact information about the notification receivers, such as email addresses. For portal notifications, receivers can be left blank. For email notifications, receivers consists of email addresses such as serena.davis@contoso.com.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("notificationChannelType", this.getNotificationChannelType());
        writer.writeCollectionOfObjectValues("notificationReceivers", this.getNotificationReceivers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("receivers", this.getReceivers());
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
     * Sets the notificationChannelType property value. The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     * @param value Value to set for the notificationChannelType property.
     */
    public void setNotificationChannelType(@jakarta.annotation.Nullable final NotificationChannelType value) {
        this.notificationChannelType = value;
    }
    /**
     * Sets the notificationReceivers property value. Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     * @param value Value to set for the notificationReceivers property.
     */
    public void setNotificationReceivers(@jakarta.annotation.Nullable final java.util.List<NotificationReceiver> value) {
        this.notificationReceivers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the receivers property value. The contact information about the notification receivers, such as email addresses. For portal notifications, receivers can be left blank. For email notifications, receivers consists of email addresses such as serena.davis@contoso.com.
     * @param value Value to set for the receivers property.
     */
    public void setReceivers(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.receivers = value;
    }
}
