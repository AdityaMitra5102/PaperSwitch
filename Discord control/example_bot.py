#import webbrowser
import discord
import requests
#from os import system
#link='start msedge -inprivate http://234e6111cda5.ngrok.io/'
URL = 'http://234e6111cda5.ngrok.io/'
client = discord.Client()

@client.event
async def on_ready():
    print('Logged in as {0.user}'.format(client))

@client.event
async def on_message(message):
   

    if message.content.startswith('$hello'):
        await message.channel.send('Hello!')
        await message.channel.send('Write $help for commands')
        print('Introduction printed')
    if message.content.startswith('$help'):
        await message.channel.send('Hello!')
        await message.channel.send('Write $turnon to Turn on light')
        await message.channel.send('Write $turnoff to Turn off light')
        print('Help printed')
    if message.content.startswith('$turnon'):
        #system(link+"switchon")
        r=requests.get(url = URL, params = 'switchon')
        await message.channel.send('Turned Light on')
        print('Light turn on request received')
    if message.content.startswith('$turnoff'):
        #system(link+"switchoff")
        r=requests.get(url = URL, params = 'switchoff')
        await message.channel.send('Turned Light off')
        print('Light turn off request received')
client.run('Nzc0NDY1NTgyNzExOTYzNjY5.X6YLRw.SYfzA9YSzQqziOlOwozEMJLxtDw')
