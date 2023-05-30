package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnlineMeeting extends Entity implements Parsable {
    /** Indicates whether attendees can turn on their camera. */
    private Boolean allowAttendeeToEnableCamera;
    /** Indicates whether attendees can turn on their microphone. */
    private Boolean allowAttendeeToEnableMic;
    /** Specifies who can be a presenter in a meeting. */
    private OnlineMeetingPresenters allowedPresenters;
    /** Specifies the mode of meeting chat. */
    private MeetingChatMode allowMeetingChat;
    /** Specifies if participants are allowed to rename themselves in an instance of the meeting. */
    private Boolean allowParticipantsToChangeName;
    /** The allowRecording property */
    private Boolean allowRecording;
    /** Indicates if Teams reactions are enabled for the meeting. */
    private Boolean allowTeamworkReactions;
    /** The allowTranscription property */
    private Boolean allowTranscription;
    /** The content stream of the alternative recording of a Microsoft Teams live event. Read-only. */
    private byte[] alternativeRecording;
    /** The anonymizeIdentityForRoles property */
    private java.util.List<OnlineMeetingRole> anonymizeIdentityForRoles;
    /** The attendance reports of an online meeting. Read-only. */
    private java.util.List<MeetingAttendanceReport> attendanceReports;
    /** The content stream of the attendee report of a Teams live event. Read-only. */
    private byte[] attendeeReport;
    /** The phone access (dial-in) information for an online meeting. Read-only. */
    private AudioConferencing audioConferencing;
    /** The broadcastRecording property */
    private byte[] broadcastRecording;
    /** Settings related to a live event. */
    private BroadcastMeetingSettings broadcastSettings;
    /** The capabilities property */
    private java.util.List<MeetingCapabilities> capabilities;
    /** The chat information associated with this online meeting. */
    private ChatInfo chatInfo;
    /** The meeting creation time in UTC. Read-only. */
    private OffsetDateTime creationDateTime;
    /** The meeting end time in UTC. */
    private OffsetDateTime endDateTime;
    /** The external ID. A custom ID. Optional. */
    private String externalId;
    /** Indicates whether this is a Teams live event. */
    private Boolean isBroadcast;
    /** Indicates whether to announce when callers join or leave. */
    private Boolean isEntryExitAnnounced;
    /** The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only. */
    private ItemBody joinInformation;
    /** Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be canceled and a new one needs to be created. */
    private JoinMeetingIdSettings joinMeetingIdSettings;
    /** The joinUrl property */
    private String joinUrl;
    /** The join URL of the online meeting. Read-only. */
    private String joinWebUrl;
    /** Specifies which participants can bypass the meeting lobby. */
    private LobbyBypassSettings lobbyBypassSettings;
    /** The meetingAttendanceReport property */
    private MeetingAttendanceReport meetingAttendanceReport;
    /** The participants associated with the online meeting. This includes the organizer and the attendees. */
    private MeetingParticipants participants;
    /** Indicates whether to record the meeting automatically. */
    private Boolean recordAutomatically;
    /** The content stream of the recording of a Teams live event. Read-only. */
    private byte[] recording;
    /** The recordings property */
    private java.util.List<CallRecording> recordings;
    /** The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled. */
    private MeetingRegistration registration;
    /** Specifies whether meeting chat history is shared with participants.  Possible values are: all, none, unknownFutureValue. */
    private MeetingChatHistoryDefaultMode shareMeetingChatHistoryDefault;
    /** The meeting start time in UTC. */
    private OffsetDateTime startDateTime;
    /** The subject of the online meeting. */
    private String subject;
    /** The transcripts of an online meeting. Read-only. */
    private java.util.List<CallTranscript> transcripts;
    /** The video teleconferencing ID. Read-only. */
    private String videoTeleconferenceId;
    /** The virtualAppointment property */
    private VirtualAppointment virtualAppointment;
    /** Specifies whether a watermark should be applied to a content type by the client application. */
    private WatermarkProtectionValues watermarkProtection;
    /**
     * Instantiates a new onlineMeeting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnlineMeeting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onlineMeeting
     */
    @javax.annotation.Nonnull
    public static OnlineMeeting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.virtualEventSession": return new VirtualEventSession();
            }
        }
        return new OnlineMeeting();
    }
    /**
     * Gets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAttendeeToEnableCamera() {
        return this.allowAttendeeToEnableCamera;
    }
    /**
     * Gets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAttendeeToEnableMic() {
        return this.allowAttendeeToEnableMic;
    }
    /**
     * Gets the allowedPresenters property value. Specifies who can be a presenter in a meeting.
     * @return a onlineMeetingPresenters
     */
    @javax.annotation.Nullable
    public OnlineMeetingPresenters getAllowedPresenters() {
        return this.allowedPresenters;
    }
    /**
     * Gets the allowMeetingChat property value. Specifies the mode of meeting chat.
     * @return a meetingChatMode
     */
    @javax.annotation.Nullable
    public MeetingChatMode getAllowMeetingChat() {
        return this.allowMeetingChat;
    }
    /**
     * Gets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowParticipantsToChangeName() {
        return this.allowParticipantsToChangeName;
    }
    /**
     * Gets the allowRecording property value. The allowRecording property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowRecording() {
        return this.allowRecording;
    }
    /**
     * Gets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTeamworkReactions() {
        return this.allowTeamworkReactions;
    }
    /**
     * Gets the allowTranscription property value. The allowTranscription property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowTranscription() {
        return this.allowTranscription;
    }
    /**
     * Gets the alternativeRecording property value. The content stream of the alternative recording of a Microsoft Teams live event. Read-only.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getAlternativeRecording() {
        return this.alternativeRecording;
    }
    /**
     * Gets the anonymizeIdentityForRoles property value. The anonymizeIdentityForRoles property
     * @return a onlineMeetingRole
     */
    @javax.annotation.Nullable
    public java.util.List<OnlineMeetingRole> getAnonymizeIdentityForRoles() {
        return this.anonymizeIdentityForRoles;
    }
    /**
     * Gets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @return a meetingAttendanceReport
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingAttendanceReport> getAttendanceReports() {
        return this.attendanceReports;
    }
    /**
     * Gets the attendeeReport property value. The content stream of the attendee report of a Teams live event. Read-only.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getAttendeeReport() {
        return this.attendeeReport;
    }
    /**
     * Gets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @return a audioConferencing
     */
    @javax.annotation.Nullable
    public AudioConferencing getAudioConferencing() {
        return this.audioConferencing;
    }
    /**
     * Gets the broadcastRecording property value. The broadcastRecording property
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getBroadcastRecording() {
        return this.broadcastRecording;
    }
    /**
     * Gets the broadcastSettings property value. Settings related to a live event.
     * @return a broadcastMeetingSettings
     */
    @javax.annotation.Nullable
    public BroadcastMeetingSettings getBroadcastSettings() {
        return this.broadcastSettings;
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a meetingCapabilities
     */
    @javax.annotation.Nullable
    public java.util.List<MeetingCapabilities> getCapabilities() {
        return this.capabilities;
    }
    /**
     * Gets the chatInfo property value. The chat information associated with this online meeting.
     * @return a chatInfo
     */
    @javax.annotation.Nullable
    public ChatInfo getChatInfo() {
        return this.chatInfo;
    }
    /**
     * Gets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.creationDateTime;
    }
    /**
     * Gets the endDateTime property value. The meeting end time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the externalId property value. The external ID. A custom ID. Optional.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowAttendeeToEnableCamera", (n) -> { this.setAllowAttendeeToEnableCamera(n.getBooleanValue()); });
        deserializerMap.put("allowAttendeeToEnableMic", (n) -> { this.setAllowAttendeeToEnableMic(n.getBooleanValue()); });
        deserializerMap.put("allowedPresenters", (n) -> { this.setAllowedPresenters(n.getEnumValue(OnlineMeetingPresenters.class)); });
        deserializerMap.put("allowMeetingChat", (n) -> { this.setAllowMeetingChat(n.getEnumValue(MeetingChatMode.class)); });
        deserializerMap.put("allowParticipantsToChangeName", (n) -> { this.setAllowParticipantsToChangeName(n.getBooleanValue()); });
        deserializerMap.put("allowRecording", (n) -> { this.setAllowRecording(n.getBooleanValue()); });
        deserializerMap.put("allowTeamworkReactions", (n) -> { this.setAllowTeamworkReactions(n.getBooleanValue()); });
        deserializerMap.put("allowTranscription", (n) -> { this.setAllowTranscription(n.getBooleanValue()); });
        deserializerMap.put("alternativeRecording", (n) -> { this.setAlternativeRecording(n.getByteArrayValue()); });
        deserializerMap.put("anonymizeIdentityForRoles", (n) -> { this.setAnonymizeIdentityForRoles(n.getCollectionOfEnumValues(OnlineMeetingRole.class)); });
        deserializerMap.put("attendanceReports", (n) -> { this.setAttendanceReports(n.getCollectionOfObjectValues(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("attendeeReport", (n) -> { this.setAttendeeReport(n.getByteArrayValue()); });
        deserializerMap.put("audioConferencing", (n) -> { this.setAudioConferencing(n.getObjectValue(AudioConferencing::createFromDiscriminatorValue)); });
        deserializerMap.put("broadcastRecording", (n) -> { this.setBroadcastRecording(n.getByteArrayValue()); });
        deserializerMap.put("broadcastSettings", (n) -> { this.setBroadcastSettings(n.getObjectValue(BroadcastMeetingSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getCollectionOfEnumValues(MeetingCapabilities.class)); });
        deserializerMap.put("chatInfo", (n) -> { this.setChatInfo(n.getObjectValue(ChatInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("isBroadcast", (n) -> { this.setIsBroadcast(n.getBooleanValue()); });
        deserializerMap.put("isEntryExitAnnounced", (n) -> { this.setIsEntryExitAnnounced(n.getBooleanValue()); });
        deserializerMap.put("joinInformation", (n) -> { this.setJoinInformation(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("joinMeetingIdSettings", (n) -> { this.setJoinMeetingIdSettings(n.getObjectValue(JoinMeetingIdSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("joinUrl", (n) -> { this.setJoinUrl(n.getStringValue()); });
        deserializerMap.put("joinWebUrl", (n) -> { this.setJoinWebUrl(n.getStringValue()); });
        deserializerMap.put("lobbyBypassSettings", (n) -> { this.setLobbyBypassSettings(n.getObjectValue(LobbyBypassSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingAttendanceReport", (n) -> { this.setMeetingAttendanceReport(n.getObjectValue(MeetingAttendanceReport::createFromDiscriminatorValue)); });
        deserializerMap.put("participants", (n) -> { this.setParticipants(n.getObjectValue(MeetingParticipants::createFromDiscriminatorValue)); });
        deserializerMap.put("recordAutomatically", (n) -> { this.setRecordAutomatically(n.getBooleanValue()); });
        deserializerMap.put("recording", (n) -> { this.setRecording(n.getByteArrayValue()); });
        deserializerMap.put("recordings", (n) -> { this.setRecordings(n.getCollectionOfObjectValues(CallRecording::createFromDiscriminatorValue)); });
        deserializerMap.put("registration", (n) -> { this.setRegistration(n.getObjectValue(MeetingRegistration::createFromDiscriminatorValue)); });
        deserializerMap.put("shareMeetingChatHistoryDefault", (n) -> { this.setShareMeetingChatHistoryDefault(n.getEnumValue(MeetingChatHistoryDefaultMode.class)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        deserializerMap.put("transcripts", (n) -> { this.setTranscripts(n.getCollectionOfObjectValues(CallTranscript::createFromDiscriminatorValue)); });
        deserializerMap.put("videoTeleconferenceId", (n) -> { this.setVideoTeleconferenceId(n.getStringValue()); });
        deserializerMap.put("virtualAppointment", (n) -> { this.setVirtualAppointment(n.getObjectValue(VirtualAppointment::createFromDiscriminatorValue)); });
        deserializerMap.put("watermarkProtection", (n) -> { this.setWatermarkProtection(n.getObjectValue(WatermarkProtectionValues::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isBroadcast property value. Indicates whether this is a Teams live event.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBroadcast() {
        return this.isBroadcast;
    }
    /**
     * Gets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEntryExitAnnounced() {
        return this.isEntryExitAnnounced;
    }
    /**
     * Gets the joinInformation property value. The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getJoinInformation() {
        return this.joinInformation;
    }
    /**
     * Gets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be canceled and a new one needs to be created.
     * @return a joinMeetingIdSettings
     */
    @javax.annotation.Nullable
    public JoinMeetingIdSettings getJoinMeetingIdSettings() {
        return this.joinMeetingIdSettings;
    }
    /**
     * Gets the joinUrl property value. The joinUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinUrl() {
        return this.joinUrl;
    }
    /**
     * Gets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoinWebUrl() {
        return this.joinWebUrl;
    }
    /**
     * Gets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @return a lobbyBypassSettings
     */
    @javax.annotation.Nullable
    public LobbyBypassSettings getLobbyBypassSettings() {
        return this.lobbyBypassSettings;
    }
    /**
     * Gets the meetingAttendanceReport property value. The meetingAttendanceReport property
     * @return a meetingAttendanceReport
     */
    @javax.annotation.Nullable
    public MeetingAttendanceReport getMeetingAttendanceReport() {
        return this.meetingAttendanceReport;
    }
    /**
     * Gets the participants property value. The participants associated with the online meeting. This includes the organizer and the attendees.
     * @return a meetingParticipants
     */
    @javax.annotation.Nullable
    public MeetingParticipants getParticipants() {
        return this.participants;
    }
    /**
     * Gets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRecordAutomatically() {
        return this.recordAutomatically;
    }
    /**
     * Gets the recording property value. The content stream of the recording of a Teams live event. Read-only.
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getRecording() {
        return this.recording;
    }
    /**
     * Gets the recordings property value. The recordings property
     * @return a callRecording
     */
    @javax.annotation.Nullable
    public java.util.List<CallRecording> getRecordings() {
        return this.recordings;
    }
    /**
     * Gets the registration property value. The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled.
     * @return a meetingRegistration
     */
    @javax.annotation.Nullable
    public MeetingRegistration getRegistration() {
        return this.registration;
    }
    /**
     * Gets the shareMeetingChatHistoryDefault property value. Specifies whether meeting chat history is shared with participants.  Possible values are: all, none, unknownFutureValue.
     * @return a meetingChatHistoryDefaultMode
     */
    @javax.annotation.Nullable
    public MeetingChatHistoryDefaultMode getShareMeetingChatHistoryDefault() {
        return this.shareMeetingChatHistoryDefault;
    }
    /**
     * Gets the startDateTime property value. The meeting start time in UTC.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the subject property value. The subject of the online meeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Gets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @return a callTranscript
     */
    @javax.annotation.Nullable
    public java.util.List<CallTranscript> getTranscripts() {
        return this.transcripts;
    }
    /**
     * Gets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVideoTeleconferenceId() {
        return this.videoTeleconferenceId;
    }
    /**
     * Gets the virtualAppointment property value. The virtualAppointment property
     * @return a virtualAppointment
     */
    @javax.annotation.Nullable
    public VirtualAppointment getVirtualAppointment() {
        return this.virtualAppointment;
    }
    /**
     * Gets the watermarkProtection property value. Specifies whether a watermark should be applied to a content type by the client application.
     * @return a watermarkProtectionValues
     */
    @javax.annotation.Nullable
    public WatermarkProtectionValues getWatermarkProtection() {
        return this.watermarkProtection;
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
        writer.writeBooleanValue("allowAttendeeToEnableCamera", this.getAllowAttendeeToEnableCamera());
        writer.writeBooleanValue("allowAttendeeToEnableMic", this.getAllowAttendeeToEnableMic());
        writer.writeEnumValue("allowedPresenters", this.getAllowedPresenters());
        writer.writeEnumValue("allowMeetingChat", this.getAllowMeetingChat());
        writer.writeBooleanValue("allowParticipantsToChangeName", this.getAllowParticipantsToChangeName());
        writer.writeBooleanValue("allowRecording", this.getAllowRecording());
        writer.writeBooleanValue("allowTeamworkReactions", this.getAllowTeamworkReactions());
        writer.writeBooleanValue("allowTranscription", this.getAllowTranscription());
        writer.writeByteArrayValue("alternativeRecording", this.getAlternativeRecording());
        writer.writeCollectionOfEnumValues("anonymizeIdentityForRoles", this.getAnonymizeIdentityForRoles());
        writer.writeCollectionOfObjectValues("attendanceReports", this.getAttendanceReports());
        writer.writeByteArrayValue("attendeeReport", this.getAttendeeReport());
        writer.writeObjectValue("audioConferencing", this.getAudioConferencing());
        writer.writeByteArrayValue("broadcastRecording", this.getBroadcastRecording());
        writer.writeObjectValue("broadcastSettings", this.getBroadcastSettings());
        writer.writeCollectionOfEnumValues("capabilities", this.getCapabilities());
        writer.writeObjectValue("chatInfo", this.getChatInfo());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeBooleanValue("isBroadcast", this.getIsBroadcast());
        writer.writeBooleanValue("isEntryExitAnnounced", this.getIsEntryExitAnnounced());
        writer.writeObjectValue("joinInformation", this.getJoinInformation());
        writer.writeObjectValue("joinMeetingIdSettings", this.getJoinMeetingIdSettings());
        writer.writeStringValue("joinUrl", this.getJoinUrl());
        writer.writeStringValue("joinWebUrl", this.getJoinWebUrl());
        writer.writeObjectValue("lobbyBypassSettings", this.getLobbyBypassSettings());
        writer.writeObjectValue("meetingAttendanceReport", this.getMeetingAttendanceReport());
        writer.writeObjectValue("participants", this.getParticipants());
        writer.writeBooleanValue("recordAutomatically", this.getRecordAutomatically());
        writer.writeByteArrayValue("recording", this.getRecording());
        writer.writeCollectionOfObjectValues("recordings", this.getRecordings());
        writer.writeObjectValue("registration", this.getRegistration());
        writer.writeEnumValue("shareMeetingChatHistoryDefault", this.getShareMeetingChatHistoryDefault());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeStringValue("subject", this.getSubject());
        writer.writeCollectionOfObjectValues("transcripts", this.getTranscripts());
        writer.writeStringValue("videoTeleconferenceId", this.getVideoTeleconferenceId());
        writer.writeObjectValue("virtualAppointment", this.getVirtualAppointment());
        writer.writeObjectValue("watermarkProtection", this.getWatermarkProtection());
    }
    /**
     * Sets the allowAttendeeToEnableCamera property value. Indicates whether attendees can turn on their camera.
     * @param value Value to set for the allowAttendeeToEnableCamera property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAttendeeToEnableCamera(@javax.annotation.Nullable final Boolean value) {
        this.allowAttendeeToEnableCamera = value;
    }
    /**
     * Sets the allowAttendeeToEnableMic property value. Indicates whether attendees can turn on their microphone.
     * @param value Value to set for the allowAttendeeToEnableMic property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAttendeeToEnableMic(@javax.annotation.Nullable final Boolean value) {
        this.allowAttendeeToEnableMic = value;
    }
    /**
     * Sets the allowedPresenters property value. Specifies who can be a presenter in a meeting.
     * @param value Value to set for the allowedPresenters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedPresenters(@javax.annotation.Nullable final OnlineMeetingPresenters value) {
        this.allowedPresenters = value;
    }
    /**
     * Sets the allowMeetingChat property value. Specifies the mode of meeting chat.
     * @param value Value to set for the allowMeetingChat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowMeetingChat(@javax.annotation.Nullable final MeetingChatMode value) {
        this.allowMeetingChat = value;
    }
    /**
     * Sets the allowParticipantsToChangeName property value. Specifies if participants are allowed to rename themselves in an instance of the meeting.
     * @param value Value to set for the allowParticipantsToChangeName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowParticipantsToChangeName(@javax.annotation.Nullable final Boolean value) {
        this.allowParticipantsToChangeName = value;
    }
    /**
     * Sets the allowRecording property value. The allowRecording property
     * @param value Value to set for the allowRecording property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowRecording(@javax.annotation.Nullable final Boolean value) {
        this.allowRecording = value;
    }
    /**
     * Sets the allowTeamworkReactions property value. Indicates if Teams reactions are enabled for the meeting.
     * @param value Value to set for the allowTeamworkReactions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowTeamworkReactions(@javax.annotation.Nullable final Boolean value) {
        this.allowTeamworkReactions = value;
    }
    /**
     * Sets the allowTranscription property value. The allowTranscription property
     * @param value Value to set for the allowTranscription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowTranscription(@javax.annotation.Nullable final Boolean value) {
        this.allowTranscription = value;
    }
    /**
     * Sets the alternativeRecording property value. The content stream of the alternative recording of a Microsoft Teams live event. Read-only.
     * @param value Value to set for the alternativeRecording property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeRecording(@javax.annotation.Nullable final byte[] value) {
        this.alternativeRecording = value;
    }
    /**
     * Sets the anonymizeIdentityForRoles property value. The anonymizeIdentityForRoles property
     * @param value Value to set for the anonymizeIdentityForRoles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAnonymizeIdentityForRoles(@javax.annotation.Nullable final java.util.List<OnlineMeetingRole> value) {
        this.anonymizeIdentityForRoles = value;
    }
    /**
     * Sets the attendanceReports property value. The attendance reports of an online meeting. Read-only.
     * @param value Value to set for the attendanceReports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendanceReports(@javax.annotation.Nullable final java.util.List<MeetingAttendanceReport> value) {
        this.attendanceReports = value;
    }
    /**
     * Sets the attendeeReport property value. The content stream of the attendee report of a Teams live event. Read-only.
     * @param value Value to set for the attendeeReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttendeeReport(@javax.annotation.Nullable final byte[] value) {
        this.attendeeReport = value;
    }
    /**
     * Sets the audioConferencing property value. The phone access (dial-in) information for an online meeting. Read-only.
     * @param value Value to set for the audioConferencing property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAudioConferencing(@javax.annotation.Nullable final AudioConferencing value) {
        this.audioConferencing = value;
    }
    /**
     * Sets the broadcastRecording property value. The broadcastRecording property
     * @param value Value to set for the broadcastRecording property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBroadcastRecording(@javax.annotation.Nullable final byte[] value) {
        this.broadcastRecording = value;
    }
    /**
     * Sets the broadcastSettings property value. Settings related to a live event.
     * @param value Value to set for the broadcastSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBroadcastSettings(@javax.annotation.Nullable final BroadcastMeetingSettings value) {
        this.broadcastSettings = value;
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapabilities(@javax.annotation.Nullable final java.util.List<MeetingCapabilities> value) {
        this.capabilities = value;
    }
    /**
     * Sets the chatInfo property value. The chat information associated with this online meeting.
     * @param value Value to set for the chatInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChatInfo(@javax.annotation.Nullable final ChatInfo value) {
        this.chatInfo = value;
    }
    /**
     * Sets the creationDateTime property value. The meeting creation time in UTC. Read-only.
     * @param value Value to set for the creationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.creationDateTime = value;
    }
    /**
     * Sets the endDateTime property value. The meeting end time in UTC.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
    /**
     * Sets the externalId property value. The external ID. A custom ID. Optional.
     * @param value Value to set for the externalId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalId(@javax.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the isBroadcast property value. Indicates whether this is a Teams live event.
     * @param value Value to set for the isBroadcast property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBroadcast(@javax.annotation.Nullable final Boolean value) {
        this.isBroadcast = value;
    }
    /**
     * Sets the isEntryExitAnnounced property value. Indicates whether to announce when callers join or leave.
     * @param value Value to set for the isEntryExitAnnounced property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEntryExitAnnounced(@javax.annotation.Nullable final Boolean value) {
        this.isEntryExitAnnounced = value;
    }
    /**
     * Sets the joinInformation property value. The join information in the language and locale variant specified in 'Accept-Language' request HTTP header. Read-only.
     * @param value Value to set for the joinInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinInformation(@javax.annotation.Nullable final ItemBody value) {
        this.joinInformation = value;
    }
    /**
     * Sets the joinMeetingIdSettings property value. Specifies the joinMeetingId, the meeting passcode, and the requirement for the passcode. Once an onlineMeeting is created, the joinMeetingIdSettings cannot be modified. To make any changes to this property, the meeting needs to be canceled and a new one needs to be created.
     * @param value Value to set for the joinMeetingIdSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinMeetingIdSettings(@javax.annotation.Nullable final JoinMeetingIdSettings value) {
        this.joinMeetingIdSettings = value;
    }
    /**
     * Sets the joinUrl property value. The joinUrl property
     * @param value Value to set for the joinUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinUrl(@javax.annotation.Nullable final String value) {
        this.joinUrl = value;
    }
    /**
     * Sets the joinWebUrl property value. The join URL of the online meeting. Read-only.
     * @param value Value to set for the joinWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoinWebUrl(@javax.annotation.Nullable final String value) {
        this.joinWebUrl = value;
    }
    /**
     * Sets the lobbyBypassSettings property value. Specifies which participants can bypass the meeting lobby.
     * @param value Value to set for the lobbyBypassSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLobbyBypassSettings(@javax.annotation.Nullable final LobbyBypassSettings value) {
        this.lobbyBypassSettings = value;
    }
    /**
     * Sets the meetingAttendanceReport property value. The meetingAttendanceReport property
     * @param value Value to set for the meetingAttendanceReport property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingAttendanceReport(@javax.annotation.Nullable final MeetingAttendanceReport value) {
        this.meetingAttendanceReport = value;
    }
    /**
     * Sets the participants property value. The participants associated with the online meeting. This includes the organizer and the attendees.
     * @param value Value to set for the participants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParticipants(@javax.annotation.Nullable final MeetingParticipants value) {
        this.participants = value;
    }
    /**
     * Sets the recordAutomatically property value. Indicates whether to record the meeting automatically.
     * @param value Value to set for the recordAutomatically property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordAutomatically(@javax.annotation.Nullable final Boolean value) {
        this.recordAutomatically = value;
    }
    /**
     * Sets the recording property value. The content stream of the recording of a Teams live event. Read-only.
     * @param value Value to set for the recording property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecording(@javax.annotation.Nullable final byte[] value) {
        this.recording = value;
    }
    /**
     * Sets the recordings property value. The recordings property
     * @param value Value to set for the recordings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordings(@javax.annotation.Nullable final java.util.List<CallRecording> value) {
        this.recordings = value;
    }
    /**
     * Sets the registration property value. The registration that has been enabled for an online meeting. One online meeting can only have one registration enabled.
     * @param value Value to set for the registration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistration(@javax.annotation.Nullable final MeetingRegistration value) {
        this.registration = value;
    }
    /**
     * Sets the shareMeetingChatHistoryDefault property value. Specifies whether meeting chat history is shared with participants.  Possible values are: all, none, unknownFutureValue.
     * @param value Value to set for the shareMeetingChatHistoryDefault property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShareMeetingChatHistoryDefault(@javax.annotation.Nullable final MeetingChatHistoryDefaultMode value) {
        this.shareMeetingChatHistoryDefault = value;
    }
    /**
     * Sets the startDateTime property value. The meeting start time in UTC.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.startDateTime = value;
    }
    /**
     * Sets the subject property value. The subject of the online meeting.
     * @param value Value to set for the subject property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubject(@javax.annotation.Nullable final String value) {
        this.subject = value;
    }
    /**
     * Sets the transcripts property value. The transcripts of an online meeting. Read-only.
     * @param value Value to set for the transcripts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTranscripts(@javax.annotation.Nullable final java.util.List<CallTranscript> value) {
        this.transcripts = value;
    }
    /**
     * Sets the videoTeleconferenceId property value. The video teleconferencing ID. Read-only.
     * @param value Value to set for the videoTeleconferenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVideoTeleconferenceId(@javax.annotation.Nullable final String value) {
        this.videoTeleconferenceId = value;
    }
    /**
     * Sets the virtualAppointment property value. The virtualAppointment property
     * @param value Value to set for the virtualAppointment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVirtualAppointment(@javax.annotation.Nullable final VirtualAppointment value) {
        this.virtualAppointment = value;
    }
    /**
     * Sets the watermarkProtection property value. Specifies whether a watermark should be applied to a content type by the client application.
     * @param value Value to set for the watermarkProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWatermarkProtection(@javax.annotation.Nullable final WatermarkProtectionValues value) {
        this.watermarkProtection = value;
    }
}
