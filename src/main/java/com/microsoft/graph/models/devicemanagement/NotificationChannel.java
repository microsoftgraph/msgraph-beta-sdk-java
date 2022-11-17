package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NotificationChannel implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue. */
    private NotificationChannelType _notificationChannelType;
    /** Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information. */
    private java.util.List<NotificationReceiver> _notificationReceivers;
    /** The OdataType property */
    private String _odataType;
    /** The contact information about the notification receivers, such as email addresses. For portal notifications, receivers can be left blank. For email notifications, receivers consists of email addresses such as serena.davis@contoso.com. */
    private java.util.List<String> _receivers;
    /**
     * Instantiates a new notificationChannel and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NotificationChannel() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagement.notificationChannel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a notificationChannel
     */
    @javax.annotation.Nonnull
    public static NotificationChannel createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NotificationChannel();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final NotificationChannel currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("notificationChannelType", (n) -> { currentObject.setNotificationChannelType(n.getEnumValue(NotificationChannelType.class)); });
            this.put("notificationReceivers", (n) -> { currentObject.setNotificationReceivers(n.getCollectionOfObjectValues(NotificationReceiver::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("receivers", (n) -> { currentObject.setReceivers(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the notificationChannelType property value. The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     * @return a notificationChannelType
     */
    @javax.annotation.Nullable
    public NotificationChannelType getNotificationChannelType() {
        return this._notificationChannelType;
    }
    /**
     * Gets the notificationReceivers property value. Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     * @return a notificationReceiver
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationReceiver> getNotificationReceivers() {
        return this._notificationReceivers;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the receivers property value. The contact information about the notification receivers, such as email addresses. For portal notifications, receivers can be left blank. For email notifications, receivers consists of email addresses such as serena.davis@contoso.com.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getReceivers() {
        return this._receivers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("notificationChannelType", this.getNotificationChannelType());
        writer.writeCollectionOfObjectValues("notificationReceivers", this.getNotificationReceivers());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("receivers", this.getReceivers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the notificationChannelType property value. The type of the notification channel. The possible values are: portal, email, phoneCall, sms, unknownFutureValue.
     * @param value Value to set for the notificationChannelType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationChannelType(@javax.annotation.Nullable final NotificationChannelType value) {
        this._notificationChannelType = value;
    }
    /**
     * Sets the notificationReceivers property value. Information about the notification receivers, such as locale and contact information. For example, en-us for locale and serena.davis@contoso.com for contact information.
     * @param value Value to set for the notificationReceivers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationReceivers(@javax.annotation.Nullable final java.util.List<NotificationReceiver> value) {
        this._notificationReceivers = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the receivers property value. The contact information about the notification receivers, such as email addresses. For portal notifications, receivers can be left blank. For email notifications, receivers consists of email addresses such as serena.davis@contoso.com.
     * @param value Value to set for the receivers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivers(@javax.annotation.Nullable final java.util.List<String> value) {
        this._receivers = value;
    }
}
